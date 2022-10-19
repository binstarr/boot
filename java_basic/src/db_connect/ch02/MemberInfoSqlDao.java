package db_connect.ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberInfoSqlDao implements iMemberInfoDao {

	// 1stfloor 테이블에 접근하는 녀석을 미리 선언
	private static final String TABLE_NAME = "about1stfloor";
	// db정보
	private DBClient client;
	// 연결권한? 정보
	private Connection connection;

	public MemberInfoSqlDao() {
		client = DBClient.getInstance();
	}

	@Override
	public ArrayList<MemberDto> selectAll() {
		connection = client.getConnection();
		ArrayList<MemberDto> resultData = new ArrayList<>(); // 초기화
		String sqlFormat = "SELECT * FROM %s";
		String sql = String.format(sqlFormat, TABLE_NAME);

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberDto dto = new MemberDto();
				dto.setFloor(rs.getInt(1));
				dto.setOwnerName(rs.getString(2));
				dto.setTenant(rs.getString(3));
				dto.setMonthlyPay(rs.getInt(4));
				dto.setStoreName(rs.getString(5));
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
	public MemberDto select(int floor) {
		connection = client.getConnection();
		MemberDto dto = null;
		String sqlFormat = "SELECT * FROM %s WHERE floor = %d";
		String sql = String.format(sqlFormat, TABLE_NAME, floor);
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				dto = new MemberDto();
				dto.setFloor(rs.getInt("floor"));
				dto.setOwnerName(rs.getString("ownerName"));
				dto.setTenant(rs.getString("tenant"));
				dto.setMonthlyPay(rs.getInt("monthlyPay"));
				dto.setStoreName(rs.getString("storeName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(stmt != null) {
				try {
					closeDB(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return dto;
	}

	@Override
	public int insert(MemberDto dto) {
		connection = client.getConnection();
		String sqlFormat = "INSERT INTO %s VALUES( %d, '%s', '%s', %d, '%s' )";
		String sql = String.format(sqlFormat, TABLE_NAME, dto.getFloor(), dto.getOwnerName(),
							dto.getTenant(), dto.getMonthlyPay(), dto.getStoreName());
		Statement stmt = null;
		int result = 0;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		MemberDto updateDto = select(dto.getFloor());
		Statement stmt = null;
		int result = 0;
		connection = client.getConnection();
		if(updateDto != null) {
			String sqlFormat = "UPDATE %s SET floor = '%d', ownerName = '%s', tenant = '%s', monthlyPay = '%d', storeName = '%s' WHERE floor = '%d' ";
			// 위와 아래의 업데이트 할 개수를 맞춰줘야함
			String sql = String.format(sqlFormat, TABLE_NAME, dto.getFloor(), dto.getOwnerName(), dto.getTenant(), dto.getMonthlyPay(), dto.getStoreName(), dto.getFloor());
			System.out.println(sql);
			try {
				stmt = connection.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					closeDB(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}else {
			System.out.println("해당 레코드가 존재하지 않습니다.");
		}
		return result;
	}

	@Override
	public int delete(int floor) {
		connection = client.getConnection();
		String sqlFormat = "DELETE FROM %s WHERE floor = %d";
		String sql = String.format(sqlFormat, TABLE_NAME, floor);
		Statement stmt = null;
		int result = 0;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				closeDB(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	private void closeDB(Statement stmt) throws SQLException {
		stmt.close();
		connection.close();
		DBClient.connectClose();
	}

}
