package db_connect.ch02;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class MemberDto {
	@NonNull 
	private int floor;
	@NonNull
	private String ownerName;
	@NonNull
	private String tenant;
	@NonNull
	private int monthlyPay;
	@NonNull
	private String storeName;
	
}
