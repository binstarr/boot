package db_connect.ch01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberInfoSqlDao implements iMemberInfoDao {

	// memerTBL에 접근하는 녀석을 미리
	private static final String TABLE_NAME = "memberTBL";

	private DBClient client;
	private Connection connection;

	public MemberInfoSqlDao() {
		client = DBClient.getInstance(); // 초기화 , 연결할때 메모리에 올리기
//		connection = client.getConnection(); // 지워버렸다 --> connection 이걸 안하면 매번 넣어줘야함
	}

	// executeQuery = select문에서 사용
	// executeUpdate = 데이터의 수정에서 사용 (insert, delete, update)
	@Override
	public ArrayList<MemberDto> selectAll() {
		// 전체 select하는 쿼리 코드 작성
		// 연결시 쿼리 날리고 결과 받고 해제
		connection = client.getConnection();
		ArrayList<MemberDto> resultData = new ArrayList<>(); // 초기화 꼭 해줘야함
		String sqlFormat = "SELECT * FROM %s";
		String sql = String.format(sqlFormat, TABLE_NAME); // mapping

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberDto dto = new MemberDto();
				dto.setMemberId(rs.getString(1));
				dto.setMemberName(rs.getString(2));
				dto.setMemberAddress(rs.getString(3));
				resultData.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDB(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultData;
	}

	@Override
	public MemberDto select(String memberId) {
		connection = client.getConnection();
		// memberId select하는 쿼리 코드 작성
		// 연결시 쿼리 날리고 결과 받고 해제
		MemberDto dto = null;
		// 쿼리문 생성
		// 결과
		String sqlFormat;
		String sql;
		sqlFormat = "SELECT*FROM %s WHERE memberId = '%s' ";
		sql = String.format(sqlFormat, TABLE_NAME, memberId);

		// SQL 구문 객체를 만들어 주어야 한다.
		Statement stmt = null;
		// 결과를 받을 수 있는 객체를 만들어 주어야 한다.
		ResultSet rs = null;

		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dto = new MemberDto();
				dto.setMemberId(rs.getString("memberId"));
				dto.setMemberName(rs.getString("memberName"));
				dto.setMemberAddress(rs.getString("memberAddress"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					closeDB(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return dto;
	}

	private void closeDB(Statement stmt) throws SQLException {
		stmt.close();
		connection.close();
		DBClient.connectClose();
	}

	@Override
	public int insert(MemberDto dto) {
		connection = client.getConnection();
		String sqlFormat = "INSERT INTO %s VALUES('%s', '%s', '%s' )";
		String sql = String.format(sqlFormat, TABLE_NAME, dto.getMemberId(), dto.getMemberName(),
				dto.getMemberAddress());
		Statement stmt = null;
		int result = 0;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDB(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int update(MemberDto dto) {
		// 선행 검사 -- 먼저 select 해서 확인 이후에 데이터를 변경 해주는 것이 좋다.
		MemberDto contextDto = select(dto.getMemberId());
		Statement stmt = null;
		int result = 0;
		
		connection = client.getConnection();
		if (contextDto != null) {
			String sqlFormat = "UPDATE %s SET memberName = '%s' WHERE memberId = '%s' ";
			String sql = String.format(sqlFormat, TABLE_NAME, dto.getMemberName(), dto.getMemberId());
			try {
				stmt = connection.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					closeDB(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("해당하는 레코드가 존재하지 않습니다.");
		}

		return result;
	}

	@Override
	public int delete(String memberId) {
		connection = client.getConnection();
		String sqlFormat = "DELETE FROM %s WHERE memberId = '%s' ";
		String sql = String.format(sqlFormat, TABLE_NAME, memberId);
		int result = 0;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			// executeUpdate -> 매개변수 String 하나를 전달하는 녀석
			// result Type int 값을 반환 : 삭제한 행의 갯수를 반환 하는 녀석
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDB(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
