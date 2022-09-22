package generic_ex.ch02;

import java.util.ArrayList;

import generic_ex.ch01.Plastic;
import generic_ex.ch01.Powder;

public class MainTest {

	public static void main(String[] args) {
		
		// 재료 
		Powder powder = new Powder();
		Plastic  plastic = new Plastic();
		
		// 사용 방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
//		ArrayList<Integer> a = new ArrayList<>(); <--- <> 안에 데이터 타입을 선언해줘야한다.
		
		// 재료 셋팅
		genericPrinter.setMaterial(powder);
		Powder usePowder = genericPrinter.getMaterial();
		System.out.println(usePowder);
		
		// 플라스틱 사용하는 
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		
		genericPrinter2.setMaterial(plastic);
		Plastic usePlastic = new Plastic();
		System.out.println(usePlastic);

	}

}
