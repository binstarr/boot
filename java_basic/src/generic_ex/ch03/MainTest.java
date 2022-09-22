package generic_ex.ch03;

import java.util.ArrayList;

import generic_ex.ch03.Plastic;
import generic_ex.ch03.Powder;

public class MainTest {

	public static void main(String[] args) {
		
		Water water = new Water();
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		
		genericPrinter.setMaterial(powder);
		System.out.println(genericPrinter.getMaterial());
		System.out.println("==================");
		genericPrinter2.setMaterial(plastic);
		System.out.println(genericPrinter2.getMaterial());
		
		// <T extends 클래스> 사용하기
		// T 자료형의 범위를 제한할 수 있음(제한 하지 않으면 자료형으로 아무 클래스나 올 수 있다.)

	}

}
