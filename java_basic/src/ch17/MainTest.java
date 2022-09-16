package ch17;

import java.util.Random;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		ToyMachine toyMachine = new ToyMachine();
		Prize[] prize1 = new Prize[4];
		prize1[0] = new LionDoll();
		prize1[1] = new BearDoll();
		prize1[2] = new AirPod();
		prize1[3] = new ToyGun();
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		toyMachine.showInfo();
		System.out.println();
		System.out.println("돈을 넣어(입력)주세요.");
		toyMachine.moneyInput =  sc.nextInt();
		toyMachine.useToyMachine();
		toyMachine.game();
		
		for(int i = 0; i < prize1.length; i++) {
			prize1[i].showInfo();
//			if(.equals()) {
//				((LionDoll)prize1[i]).getPrize();
//			}
		}
	
		
		
		
		
		
		

	}

}
