package variable;

import java.io.IOException;

public class Input {

	public static void main(String[] args) throws IOException {
		System.out.print("정수 입력 : ");
		int a = System.in.read(); //1개 '문자'만 받을 수 있음
		System.in.read(); // 엔터 데이터 \n 삭제
		System.in.read(); // 엔터 데이터 \r 삭제
		
		System.out.print("정수 입력 : ");
		int b  = System.in.read();//1개 '문자'만 받을 수 있음
		
		System.out.println(a + " + " + b + " = " + (a+b));

	}

}
