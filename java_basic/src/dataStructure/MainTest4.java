package dataStructure;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainTest4 {
	
	

	public static void main(String[] args) {
		
		Set<Integer> set;
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(lottoNumber());
		hashSet.add(lottoNumber());
		hashSet.add(lottoNumber());
		hashSet.add(lottoNumber());
		hashSet.add(lottoNumber());
		hashSet.add(lottoNumber());
//		System.out.println(hashSet);
		
		boolean flag = true;
		while(true) {
			if(hashSet.size() < 7) {
				hashSet.add(lottoNumber());
			}else {
				flag = false;
			}
		
		}
		
		
		
		

	}
	
	// 1. 랜덤 함수 뽑기 1~45까지
	public static int lottoNumber() {
		Random random = new Random();
		int result = random.nextInt(6) + 1;
		return result;
		
		
	}

}
