package test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Dog {

	private String name;
	private int age;

}

public class LombokTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("뽀삐");
		dog.getName();
		System.out.println(dog.getName());

		dog.getAge();
	}

}
