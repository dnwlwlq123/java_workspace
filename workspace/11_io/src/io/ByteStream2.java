package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		//***************파일 다운로드 (code)*********************
		
		
		File file = new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream (new FileInputStream(file));
		
		int size = (int)file.length(); //파일의 크기
		
		byte [] ar = new byte[size];
		//파일 내용 읽기
		bis.read(ar, 0, size); //한번에 출력하고싶을때
		
		System.out.println(new String (ar)); // byte[] -> String으로 변환
		
		bis.close();
	}

}
