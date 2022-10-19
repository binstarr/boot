package io_ex.ch04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainTest3 {

	public static void main(String[] args) {
		
		String originalFilePath = "C:\\java1.zip";
		String copyFilePath = "copy_java1.zip";
		
		try(FileInputStream fis = new FileInputStream(originalFilePath);) {
			try(FileOutputStream fos = new FileOutputStream(copyFilePath);) {
				int i;
				while((i = fis.read()) != -1) {
					fos.write(i);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
