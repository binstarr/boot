package io_ex.ch04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("writer_1.txt")) {
			try (FileOutputStream fos = new FileOutputStream("copy.txt")) {
				int i;
				while ((i = fis.read()) != -1) {
					fos.write(i);
				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
		}

	}

}
