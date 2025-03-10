package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사 {

	public static void main(String[] args) {
		
		
		
		//이미지 파일 복사하기
		
		//입력스트림(바이트 기반 스트림)
		//출력스트림(바이트 기반 스트림)
		
		//FileInputStream
		//FileOutputStream
		
		
		
		try {
			
			FileInputStream f = new FileInputStream("res/img.jpg");
			FileOutputStream o = new FileOutputStream("res/imgcopy.jpg");
			
			while(true) {
			int data = f.read();	// 파일의 끝 -1
			if( data == -1) break;
			o.write(data);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
