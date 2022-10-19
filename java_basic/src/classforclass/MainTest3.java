package classforclass;

public class MainTest3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person = new Person("James");
		System.out.println(person);
		System.out.println("---------------");
		
		// (패키지명.클래스명)
		Class c1 = Class.forName("classforclass.Person");
		// 클래스의 정보를 확인 - 생성자, 메서드 확인하는 방법
		// 객체 생성하는 방법
		Person person2 = (Person)c1.newInstance();
		System.out.println(person2); // <-- 메모리에 올라간거 확인

	}

}
