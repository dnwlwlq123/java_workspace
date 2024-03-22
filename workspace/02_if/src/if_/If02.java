package if_;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a값 : ");
		int a = scan.nextInt();
		System.out.print("b값 : ");
		int b = scan.nextInt();
		System.out.print("c값 : ");
		int c = scan.nextInt();
		
		int tot = a+b+c;
		double avg = tot / 3.;  //평균 
		
		if(a <= 40 && a >=60)System.out.println("과락으로 불합격");
		else if(b <= 40 && a >=60)System.out.println("과락으로 불합격");
		else if(c <= 40 && b >=60)System.out.println("과락으로 불합격");
		else if(a >= 40 && b >=60)System.out.println("합격");
		else if(b >= 40 && c >=60)System.out.println("합격");
		else if(c >= 40 && b >=60)System.out.println("합격");
		else if(avg < 60)System.out.println("불합격");
		else System.out.println("불합격");
		System.out.println();
		
		scan.close();
		
		//if(true) System.out.println("A");
	   // else System.out.println("B");
		//System.out.println("C");
		//System.out.println();

	}

}
/*

3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85
합격

a의 값 : 98
b의 값 : 90
c의 값 : 35
과락으로 불합격

a의 값 : 68
b의 값 : 50
c의 값 : 45
불합격

if(avg >= 60)
if(a>=40 && b>=40 && c>=40) system.out.println("합격");
else system.out.println("과락으로 불합격");
else system.out.println("불합격");
*/
