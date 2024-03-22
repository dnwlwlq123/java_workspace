package homework;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ques;
		int com1;
		int com2;
		int user;
		int count = 0;
		int sum = 0;
		
		label : while(true) {
			for(ques=1; ques<=5; ques++) {
				com1 = (int)(Math.random()*90 + 10);
				com2 = (int)(Math.random()*90 + 10);
				System.out.print(+ ques + ". " + com1 + "+" + com2 + "=" );
				user = scan.nextInt();
				if(user == (com1+com2)){System.out.println("**딩동댕**");
				sum +=20;
				count +=1; 
				continue;
				}
				else if(user != (com1+com2))System.out.println("틀렸다");
				System.out.print(+ ques + ". " + com1 + "+" + com2 + "=" );
				user = scan.nextInt();
				if(user == (com1+com2)){System.out.println("**딩동댕**");
				continue;
				}
				System.out.println("틀렸다 정답은" + (com1+com2));
				
			}//for 
			System.out.println();
			System.out.println("당신은 총" + count + "문제를 맞추어서 점수" + sum +"점 입니다");
			System.out.println();
			
			System.out.print("또 하시겠습니까? (Y/N) : ");
			String yn = scan.next();
			if(yn.equals("N"))break;
			else if(yn.equals("Y"))
				continue;
			for(;;) {
				System.out.print("또 하시겠습니까? (Y/N) : ");
				String yn1 = scan.next();
				if(yn1.equals("N"))
					break label; 
				else if(yn1.equals("Y"))
					break;
			}
		}//while 
		System.out.println("프로그램을 종료합니다.");
	}
	
}
/*[문제] 덧셈 계산 (for, while, 다중 for)
- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 5문제를 제공한다.
- 1문제당 점수 20점씩 처리한다.
- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.

[실행결과]
[1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 59
틀렸다 정답은 xx

[2] 10 + 25 = 35
딩동뎅

[5] 78 + 95 = 89
틀렸다
[5] 78 + 95 = 173
딩동뎅

당신은 총 x 문제를 맞추어서 점수 xx점 입니다.

또 할래(Y/N) : a
또 할래(Y/N) : w
또 할래(Y/N) : n

프로그램을 종료합니다.
*/