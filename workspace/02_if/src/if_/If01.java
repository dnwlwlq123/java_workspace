package if_;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("데이터 입력 : ");
		int a = scan.nextInt();
		
		if(a >= 50) System.out.println(a + "는 50 보다 크거나 같다");
		System.out.println(a + "는 50보다 작다");
		System.out.println();

		if(true)
			if(true) System.out.println("A");
	        else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		if(true)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		if(false)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		scan.close();
			
	}
	
	

}
