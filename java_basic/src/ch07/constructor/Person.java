package ch07.constructor;

public class Person {

	int height;
	int weight;
	String gender;
	String name;
	int age;
	
	public Person() {
		//기능 호출
		this.showPersonProfile();
		if(this.name == null) {
			System.out.println("값을 입력해주세요");
		}
	}
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
//	public String showPersonProfile() {
//		return "키가 " + height +
//					 "이고 몸무게가 " + weight + 
//					 "킬로인 " + gender + 
//					 "이 있습니다. 이름은 " + name + 
//					 "이고 나이는 " + age + "세 입니다.";
//	}
	
	public void showPersonProfile() {
		System.out.println("===상태창===");
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + gender);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
