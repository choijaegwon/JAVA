package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");	 // input.txt 파일 입력 스트림 생성
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());		
		} catch (IOException e) {
			System.out.println(e);
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e){
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}