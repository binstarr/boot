package db_connect.ch01;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data  // <-- getter + setter + builder
@RequiredArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor & @NoArgsConstructor 충돌이 일어나서 밑에 @NonNull 넣음
public class MemberDto {
	@NonNull
	private String memberId;
	@NonNull
	private String memberName;
	private String memberAddress;
}
