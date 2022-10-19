package db_connect.ch01;

import java.util.ArrayList;

public interface iMemberInfoDao {
	// 기능 정리 CRUD
//	void insert(String memberId, String memberName, String memberAddress); // <-- 많으면 클래스로 묶을 수 있다.
	ArrayList<MemberDto> selectAll();
	MemberDto select(String memberId);
	int insert(MemberDto dto);
	int update(MemberDto dto);
	int delete(String memberId); // 보통 pk로 받는다. ex) pk로 전체 삭제
}
