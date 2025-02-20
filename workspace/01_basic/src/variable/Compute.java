package variable;

import java.text.DecimalFormat;

public class Compute {
	//short a ; //필드

	public static void main(String[] args) {
		short a = 320; //지역변수, Local variable
		short b = 258;
		
		short sum = (short)(a + b);
		short sub = (short)(a - b);
		int mul = (a * b);
		double div = (double)a / b;
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div));
		System.out.printf(a + " / " + b + " = " + "%.2f", div);

	}

}

/*
[문제] 변수를 이용하여 320, 258의 합(sum), 차(sub), 곱(mull), 몫(div) 
[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = 1.24031007751938
*/ 
