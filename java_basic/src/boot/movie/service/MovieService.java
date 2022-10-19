package boot.movie.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import boot.movie.dto.RequestMovie;
import boot.movie.dto.ResponseMovie;
import boot.movie.interfaces.iMovieService;
import boot.movie.utils.DBHelper;

public class MovieService implements iMovieService {

	private DBHelper dbHelper;
	private PreparedStatement psmt;
	private ResultSet rs;

	public MovieService() {
		initData();
	}

	private void initData() {
		dbHelper = DBHelper.getInstance();
	}

	// TODO
	private String selectQuery = " select A.이름 AS 영화이름, A.개봉연도, A.매출액, A.관객수, A.평점, B.역, C.이름 AS 배우이름 "
			+ "from 영화 as A " + "join 출연 as B on A.번호 = B.영화번호 " + "join 배우 as C on C.번호 = B.배우번호 ";

	@Override
	public List<ResponseMovie> selectAllMovieInfo() {
		List<ResponseMovie> list = new ArrayList<>();

		try {
			rs = dbHelper.getConnection().prepareStatement(selectQuery).executeQuery();

			while (rs.next()) {
				ResponseMovie movie = new ResponseMovie();
				movie.setMovieName(rs.getString("영화이름"));
				movie.setYear(rs.getString("개봉연도"));
				movie.setSales(rs.getString("매출액"));
				movie.setAudience(rs.getString("관객수"));
				movie.setRating(rs.getString("평점"));
				movie.setRoleName(rs.getString("역"));
				movie.setName(rs.getString("배우이름"));
				list.add(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ResponseMovie> selectMovieByName(String movieName) {
		// like 사용, 공백제거
		String query = selectQuery +  "WHERE A.이름 LIKE";
		List<ResponseMovie> list = new ArrayList<>();
		
		try {
			psmt = dbHelper.getConnection().prepareStatement(query);
			psmt.setString(1, "%" + movieName.trim() + "%");
			rs = psmt.executeQuery();
			while(rs.next()) {
				ResponseMovie movie = new ResponseMovie();
				movie.setMovieName(rs.getString("영화이름"));
				movie.setYear(rs.getString("개봉연도"));
				movie.setSales(rs.getString("매출액"));
				movie.setAudience(rs.getString("관객수"));
				movie.setRating(rs.getString("평점"));
				movie.setRoleName(rs.getString("역"));
				list.add(movie);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return list;
	}

	@Override
	public boolean insertMovie(RequestMovie req) {
		// 트렌잭션 정상 쿼리가 등록 되었으면 true 반환, false 처리
		boolean flag = true;
		// 트랜잭션 사용하기
		// setAutoCommit 트랜잭션 처리 -- 기본값은 true이다 --> 바로 적용이 된다
		try {
			dbHelper.getConnection().setAutoCommit(false);
			// 1. 영화 테이블에 마지막 번호 돌고 오기
			String query1 = "SELECT 번호 FROM 영화 ORDER BY 번호 DESC LIMIT 1";
			rs = dbHelper.getConnection().prepareStatement(query1).executeQuery();
			while (rs.next()) {
				int lastId = Integer.parseInt(rs.getString("번호")) + 1;
				req.set영화번호(lastId);
				System.out.println("영화번호 : " + lastId);
			}

			// 배우 테이블에 마지막 번호 들고 오기
			getLastNumber(req);

			// 영화 데이터 저장
			String query3 = "INSERT INTO 영화(번호, 이름, 개봉연도, 관객수, 평점) VALUES(?, ?, ?, ?, ?)";
			psmt = dbHelper.getConnection().prepareStatement(query3);
			psmt.setInt(1, req.get영화번호());
			psmt.setString(2, req.get영화이름());
			psmt.setInt(3, req.get개봉연도());
			psmt.setInt(4, req.get관객수());
			psmt.setDouble(5, req.get평점());
			psmt.executeUpdate();

			// 배우 데이터 저장
			String query4 = "INSERT INTO 배우(번호, 이름, 출생, 키, 몸무게) VALUES(?, ?, ?, ?, ?) ";
			psmt = dbHelper.getConnection().prepareStatement(query4); // 하나의 쿼리를 만들어주는 녀석
			psmt.setInt(1, req.get배우번호());
			psmt.setString(2, req.get배우이름());
			psmt.setString(3, req.get출생());
			psmt.setInt(4, req.get키());
			psmt.setInt(5, req.get몸무게());
			psmt.executeUpdate();

			// 출연 데이터 저장
			String query5 = "INSERT INTO 출연(영화번호, 배우번호, 역할, 역) VALUES(?, ?, ?, ?) ";
			psmt = dbHelper.getConnection().prepareStatement(query5); // 하나의 쿼리를 만들어주는 녀석
			psmt.setInt(1, req.get영화번호());
			psmt.setInt(2, req.get배우번호());
			psmt.setInt(3, req.get역할());
			psmt.setString(4, req.get역());
			psmt.executeUpdate();

			// 실제 데이터 베이스에 반영
			// 트랜잭션 순서
			//	 dbHelper.getConnection().setAutoCommit(false); 여기서
			// 내용
			//	 dbHelper.getConnection().commit(); 여기까지 묶는게 트랜잭션 -> 여기까지 완료가 되어야 데이터베이스에 반영한다.
			//dbHelper.getConnection().setAutoCommit(true); < 문제 없을시 커밋
			dbHelper.getConnection().commit();
			// 다시 원상 복구로 돌려 놓는 것을 권장
			dbHelper.getConnection().setAutoCommit(true);
			System.out.println("11111111111111111111111");
		} catch (SQLException e) {
			try {
				dbHelper.getConnection().rollback();
				System.out.println("롤백됐습니다.");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				psmt.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	private void getLastNumber(RequestMovie req) throws SQLException {
		String query2 = "SELECT 번호 FROM 배우 ORDER BY 번호 DESC LIMIT 1";
		rs = dbHelper.getConnection().prepareStatement(query2).executeQuery();
		while (rs.next()) {
			int lastId = Integer.parseInt(rs.getString("번호")) + 1;
			req.set배우번호(lastId);
			System.out.println("배우번호 : " + lastId);
		}
	}

	@Override
	public void updateMovie(String oldName, String newName) {
		String query = "UPDATE 영화 SET 이름 = ? WHERE 이름 = ? ";
		try {
			psmt = dbHelper.getConnection().prepareStatement(query);
			psmt.setString(1, newName);
			psmt.setString(2, oldName);
			psmt.executeUpdate();
			dbHelper.getConnection().commit(); 
			dbHelper.getConnection().setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteMovie(int movieId) {
		// 트랜잭션 사용해야 한다.
		// 영화 삭제
		// 출연 삭제
		// 트랜잭션 묶음 처리 한다.
		try {
			dbHelper.getConnection().setAutoCommit(false);
			
			String query = " DELETE FROM 출연 WHERE 영화번호 = ? ";
			psmt = dbHelper.getConnection().prepareStatement(query);
			psmt.setInt(1, movieId);
			psmt.executeUpdate();
			
			String query1 = " DELETE FROM 영화 WHERE 번호 = ? ";
			psmt = dbHelper.getConnection().prepareStatement(query);
			psmt.setInt(1, movieId);
			psmt.executeUpdate();
			
			dbHelper.getConnection().commit();
			// 다시 원상 복구로 돌려 놓는 것을 권장
			dbHelper.getConnection().setAutoCommit(true);
		} catch (SQLException e) {
			try {
				dbHelper.getConnection().rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
	         try {
	             rs.close();
	             psmt.close();
	             dbHelper.connectionClose();
	          } catch (SQLException e) {
	             e.printStackTrace();
	          }
	       }


	}

	public static void main(String[] args) {
		MovieService a = new MovieService();
		RequestMovie movie = new RequestMovie(); // insert 매개변수가 RequestMovie라서 새로 선언을 해줘야 한다.

		/*
		 * psmt.setString(2, req.get배우이름()); psmt.setInt(3, req.get개봉연도());
		 * psmt.setInt(4, req.get관객수()); psmt.setDouble(5, req.get평점());
		 */
//		movie.set영화이름("수리남3");
//		movie.set개봉연도(2020);
//		movie.set관객수(100);
//		movie.set평점(9.11);
//		movie.set배우이름("황정민");
//		movie.set출생("1999-04-27 000000");
//		movie.set키(180);
//		movie.set몸무게(80);
////        movie.set영화번호(1);
////        movie.set배우번호(1);
//		movie.set역할(1);
//		movie.set역("전목사");
//		a.insertMovie(movie);
		a.deleteMovie(17);
//		System.out.println(a.selectAllMovieInfo());

	}

}
