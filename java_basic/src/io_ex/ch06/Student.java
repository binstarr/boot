package io_ex.ch06;

import java.io.Serializable;

//object를 파일에 저장하고 싶을 때 -- OutStream(기반스트림) + FileObjectOutStream(보조 스트림)
// writeObject(object)
// implements Serializable = 직렬화 - 클래스를 바이트 단위로 직렬화 시킨다.(0101) -> 클래스를 압축한다.
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L; // 고유값
	String name;
	transient int age; // 직렬화 시킬 때 제외 (파일에 데이터가 저장안됨 )
	String tel;
	
	// 기본 생성자를 넣어 주어야 한다.
	public Student() {
	}
	
	public Student(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}

	
	
	

}
