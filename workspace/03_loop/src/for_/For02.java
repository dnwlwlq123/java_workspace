package for_;

import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException{
		int dan;
		System.out.println("숫자입력 : ");
		dan = System.in.read()-48; // -48 문자를 숫자로 변경
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}
}

