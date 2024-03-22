package while_;

import java.io.IOException;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int com;
		int user;
		int count = 0;
		
		
		while(true) {
			com = (int)(Math.random()*100 + 1);//난수발생
			System.out.println(com);
			System.out.print("1 ~ 100사이의 숫자를 맞추세요");
			count = 0;
			
			while(true) {
				System.out.println("숫자 입력 : ");
				user = scan.nextInt();
				count++;
				if(com == user) {
					System.out.println("딩동댕 " + count + "번만에 맞추셨습니다"); 
					break;
				}
				else if(com>user)System.out.println(user + "보다 큰 숫자입니다");
				else System.out.println(user + "보다 작은 숫자입니다");
			}//while
			System.out.println();
			
			System.out.print("또 할래? (y/n) : ");
			String yn = scan.next();
			
			if(yn.equals("n"))break;
		}//while
		System.out.println("프로그램을 종료합니다");
	}

}
	

