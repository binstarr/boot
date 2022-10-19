package io_ex.ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentMainTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		// 기반 스트림 준비 (FileOutputStream) + 보조 스트림 (ObjectOutputStream)
		try {
			fis = new FileInputStream("fos.txt");
			ois = new ObjectInputStream(fis);

			Student s1 = (Student) ois.readObject();
			System.out.println(s1.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
