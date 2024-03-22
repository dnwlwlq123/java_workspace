package homework;

public class Jinsu {
	
	public static void main(String[] args) {
		
		int dec = 250;
		System.out.println("10진수 = " + dec);
		
		String bin = Integer.toBinaryString(dec);
		System.out.println("2진수 = " + bin);
		
		String oct = Integer.toOctalString(dec);
		System.out.println("8진수 = " + oct);
		
		String hex = Integer.toHexString(dec);
		System.out.println("16진수 = " + hex);
		
		
	}

}

/* 250을 변수에다 넣은수 2진수, 8진수, 16진수로 변환한 값을 출력 하시오
[조건]
2진수, 8진수, 16진수로 변환시켜주는 함수 가 있습니다 메소드를 이용하시오 - Integer 
10진수 = 250(dec)
2진수 = 1111 1010(bin)
8진수 = 372(oct)
16진수 = FA(hex)
*/

