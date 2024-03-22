package array;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int user; 
		int pos;
		
		car : while(true) {
			boolean[] ar = new boolean[5];
			System.out.println("주차장 관리 프로그램");
			System.out.println("************");
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 리스트");
			System.out.println("4. 종료");
			System.out.println("************");
			
			System.out.print("메뉴: ");

	        user = scan.nextInt();
	        if(user == 1) { 
	        	System.out.println("위치 입력 : ");
	        	pos= scan.nextInt();
	        	
	        	if(ar[pos-1]) System.out.println("이미 주차되어있습니다");
	        	else {
	        		ar[pos-1] = true;
	        		System.out.println(pos + "위치에 입차");
	        	}
	        	
	        }
	        else if(user == 2) {
	        	System.out.println("위치 입력 : ");
	        	pos = scan.nextInt();
	        	
	        	if(ar[pos-1]) {
	        		(ar[pos-1])= false;
	        	
	        		System.out.println(pos + "위치에 출차");
	        	}
	        	else {
	        		System.out.println("주차되어 있지 않습니다.");
	        }
	        
	        if(user == 3){
	        	for(int i=0; i<ar.length; i++) {
	        		System.out.println((i+1)+"위치 : " + ar[i]);
	        	}
	        }
	        if(user == 4) { 
	        	break car;
	        }
	        	
	     } //for
		
		}//while
		System.out.println("프로그램을 종료합니다.");
	}
}
		
	



