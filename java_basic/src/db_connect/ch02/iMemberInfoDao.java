package db_connect.ch02;

import java.util.ArrayList;

public interface iMemberInfoDao {

	// CRUD
	ArrayList<MemberDto> selectAll();
	MemberDto select(int floor);
	int insert(MemberDto dto);
	int update(MemberDto dto);
	int delete(int floor); // delete는 pk로 받음
}
