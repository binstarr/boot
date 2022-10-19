package boot.movie.dto;

import lombok.Data;

@Data
public class RequestMovie {
	private int 영화번호;
	private String 영화이름;
	private int 개봉연도;
	private int 관객수;
	private double 평점;
	private int 배우번호;
	private String 배우이름;
	private String 출생;
	private int 키;
	private int 몸무게;
	private int 역할 = 1;
	private String 역;

}
