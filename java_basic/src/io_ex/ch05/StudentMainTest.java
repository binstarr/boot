package io_ex.ch05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentMainTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		// 기반 스트림 준비 (FileOutputStream) + 보조 스트림 (ObjectOutputStream)
		try {
			fos = new FileOutputStream("fos.txt");
			oos = new ObjectOutputStream(fos);
			Student student = new Student("홍길동", 10, "010-1234-1234");
			oos.writeObject(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
