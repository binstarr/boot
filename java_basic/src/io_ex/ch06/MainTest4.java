package io_ex.ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainTest4 {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream objectInputStream = 
					new ObjectInputStream(new FileInputStream("temp2.txt"));
			Student student = (Student)objectInputStream.readObject();
			System.out.println(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
