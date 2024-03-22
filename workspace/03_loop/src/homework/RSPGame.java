package homework;


import java.io.IOException;
import java.util.Scanner;

public class RSPGame {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int basicMoney = 1000;
        
        	while (true) {
        		 
	            int user;
	            int com;
	            int bettingAmount;
	
	            com = (int) (Math.random() * 3 + 1);
	            //System.out.println(com);
	            System.out.print("가위(1), 바위(2), 보(3) 입력: ");
	            user = scan.nextInt();
	
	            do {
	            	System.out.print("배팅 금액: ");
	            	bettingAmount = scan.nextInt();
	            	
	            	if(basicMoney < bettingAmount) System.out.println("당신의 현재금액은" + basicMoney + "입니다" );
	            	
	            	else break;
	            }while(true);
	            
	            System.out.print("결과를 보시려면 Enter를 치세요");
	    		System.in.read(); 
	    		System.in.read();  
	        
	            switch (com) {
	                case 1: com = 1;
	                    System.out.print(" com 가위");break;
	                case 2: com = 2;
	                    System.out.print(" com 바위");break;
	                case 3: com = 3;
	                    System.out.print(" com 보");break;
	            }
	
	            switch (user) {
	                case 1: user = 1;
	                    System.out.print("  user 가위"); break;
	                case 2: user = 2;
	                    System.out.print("  user 바위");break;
	                case 3: user = 3;
	                    System.out.println("  user 보");break;
	            }
	            System.out.println();
	            
	            if (com == user) {
	                System.out.println("무승부입니다");
	            } 
	            else if ((com - user + 3) % 3 == 1) {
	                System.out.println("졌다..ㅠㅠ");
	                basicMoney -= bettingAmount;
	            } 
	            else {
	                System.out.println("야~호 이겼다");
	                basicMoney += bettingAmount; 
	            }
	
	            System.out.println("현재 금액은 " + basicMoney + "원");
	            System.out.println("----------------");
	
	            if (basicMoney <= 0) {
	                System.out.println("금액이 부족하여 게임을 종료합니다.");
	
	                System.out.print("또 할래(Y/N): ");
	                String yn = scan.next();
	
	                if (yn.equals("N")) {
	                    System.out.println("프로그램을 종료합니다.");
	                    break;
	                }
	
	                System.out.print("코인을 넣으세요: ");
	                basicMoney = scan.nextInt();
	            } 
	            else {
	                System.out.print("또 할래(Y/N): ");
	                String yn = scan.next();
	
	                if (yn.equals("N")) {
	                    System.out.println("프로그램을 종료합니다.");
	                    break;
                }
            }
        }
    }
}
/*
[문제] 가위 바위 보 게임
- 가위(1), 바위(2), 보(3)으로 설정한다.
- 컴퓨터는 난수 1 ~ 3 사이의 숫자를 발생한다.char a = (char)(Math.random() * 26 + 65);
  System.out.print(a + " ");
- 기본 금액은 1000원을 기본으로 설정한다.(count)
- 배팅금액이 현재금액보다 크며 다시 입력한다.
- 돈이 떨어지면 (0 이하이면) 게임을 계속할지 물어보고 계속하려면 현금 입력을 받고 다시 게임을 한다.
 
[실행결과]
가위(1) 바위(2) 보(3) 입력 : 
당신의 현재금액은 1000원 입니다.
배팅 금액 : 100
결과를 보시려면 Enter를 치세요

com 바위, user 가위
ㅠㅠ..졌다
현재 금액은 900원
-------------------------------
가위(1) 바위(2) 보(3) 입력 : 
배팅 금액 : 100
결과를 보시려면 Enter를 치세요

com 보, user 가위
야~호 이겼다.
현재 금액은 -100원

또 할래(y/n) : n
프로그램을 종료합니다.

또는 또할래(y/n) : y
insert coin : 
 */
