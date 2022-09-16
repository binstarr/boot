package ch17A;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// 사자 인형, 곰 인형, 권총, 에어팟
public class ToyMachine {

	Product[] products;

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public Product[] getProduct(int count) {
		// 랜덤 변수랑 사용자가 넣은 값이 맞으면 당첨
		Product[] targetOk = new Product[count];
		//ToyMachine 머신 안에 있는 product 상품들을 랜덤으로 가지고 와서
		// targetOk 담고 리턴하면 된다.
		
		for(int i = 0; i < targetOk.length; i++) {
			System.out.println();
			targetOk[i] = products[i];
			products[i] = null;
		}
		
		// 실제 products[] 녀석을 null 처리해주면 된다.
		return targetOk;
		
		
		
	}
	
	
	
}
// 객체 지향 패터다임으로 코드를 설계하고
// 동작을 구현시킬 수 있는 코딩능력을 테스트 !