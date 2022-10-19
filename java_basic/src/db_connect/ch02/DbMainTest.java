package db_connect.ch02;

import java.util.ArrayList;

public class DbMainTest {

	public static void main(String[] args) {
		// DBHelper <--- DBClient
		// 인터페이스
		// Dto
		// 인터페이스 Dto
		MemberInfoSqlDao infoSqlDao = new MemberInfoSqlDao(); 
		
		// selectAll
		ArrayList<MemberDto> arrayList = infoSqlDao.selectAll();
		System.out.println(arrayList);
		
		// select
		MemberDto memberDto = infoSqlDao.select(102);
		if(memberDto == null) {
			System.out.println("검색할 번호가 잘못되었습니다.");
		}else {
			System.out.println(memberDto.getFloor());
			System.out.println(memberDto.getOwnerName());
			System.out.println(memberDto.getTenant());
			System.out.println(memberDto.getMonthlyPay());
			System.out.println(memberDto.getStoreName());
		}
		
		System.out.println("=====================");
		// insert
//		MemberDto memberDto2 = new MemberDto();
//		memberDto2.setFloor(110);
//		memberDto2.setOwnerName("호날두");
//		memberDto2.setTenant("메시");
//		memberDto2.setMonthlyPay(50);
//		memberDto2.setStoreName("북경반점");
//		int resultQueryCount = infoSqlDao.insert(memberDto2);
		
		System.out.println("=====================");
		// update
		MemberDto memberDto3 = new MemberDto();
		memberDto3.setFloor(110);
		memberDto3.setOwnerName("모비치");
		memberDto3.setTenant("호날두");
		memberDto3.setMonthlyPay(10);
		memberDto3.setStoreName("닭고기");
		int updateQueryCount = infoSqlDao.update(memberDto3);
		
		System.out.println("=====================");
		// delete
		int deleteRowCount = infoSqlDao.delete(110);
		
	}

}
