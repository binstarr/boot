package db_connect.ch01;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		
		MemberInfoSqlDao infoSqlDao = new MemberInfoSqlDao();
		MemberDto memberDto = infoSqlDao.select("HAN");
		
		if(memberDto == null) {
			System.out.println("요청하신 값으로는 정보를 찾을 수 없습니다.");
		}else {
			System.out.println(memberDto.getMemberId());
			System.out.println(memberDto.getMemberName());
			System.out.println(memberDto.getMemberAddress());
		}
		
		ArrayList<MemberDto> arrayList = infoSqlDao.selectAll();
		System.out.println(arrayList);
		
		System.out.println("======================");
		// delete
		int deleteRowCount = infoSqlDao.delete("Dang");
		System.out.println("deleteRowCount : " + deleteRowCount);
		
		System.out.println("======================");
		// insert
		MemberDto memberDto2 = new MemberDto();
		memberDto2.setMemberId("ab");
		memberDto2.setMemberName("강호동");
		memberDto2.setMemberAddress("부산 진구");
		int resultQueryCount = infoSqlDao.insert(memberDto2);
		System.out.println("resultQueryCount : " + resultQueryCount);
		
		System.out.println("======================");
		MemberDto memberDto3 = new MemberDto();
		memberDto3.setMemberId("abc");
		memberDto3.setMemberName("티모");
		memberDto3.setMemberAddress("부산시 해운대구");
		int updateQueryCount = infoSqlDao.update(memberDto3);

		
	}

}
