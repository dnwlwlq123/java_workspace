package variable;

import java.util.Random;

public class Variable03 {

	public static void main(String[] args) {
		int big = Math.max(25, 36);
		System.out.println("최대값 = " + big); 
		
		double small = Math.min(12.3, 78.5);
		System.out.println("최소값 = " + small);
		System.out.println();
		
		int sum = 2 + 5; //순수 정수
		System.out.println("합 = " + sum);
		int sum2 = '2' - 48 + '5'-'0'; //문자
		System.out.println("합2 = " + sum2);
		int sum3 = Integer.parseInt("2") + Integer.parseInt("5"); //문자열 -> 정수
		System.out.println("합2 = " + sum3);
		
		float a = Float.parseFloat("43.8f");
		double b = Double.parseDouble("43.8");
		System.out.println("합 = " + String.format("%.1f\n" , (a+b)));
		System.out.println();
		
		double c = Math.random();
		System.out.println("무작위 수 = " + c);
		
		int d = (int)(Math.random() * 26 + 65);
		System.out.println(d);
		System.out.println((char)d);
		
		double e = new Random().nextDouble();
		System.out.println("e는 = " + e);
		
	}

}

/*
난수
=> 컴퓨터가 불규칙하게 발생하는 수 
=> 0 <= 난수 < 1
x ~ y 사이의 난수 발생
Math.random()*(y-x+1) + x)
*/
