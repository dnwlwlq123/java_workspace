package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
      
      System.out.print("이름 입력 : ");
      String name = scan.nextLine();
      System.out.print("직급 입력: ");
      String rank = scan.nextLine();
      System.out.print("기본급 입력: ");
      int basicmoney = scan.nextInt();
      System.out.print("수당 입력: ");
      int benefit = scan.nextInt();
      
      int total = basicmoney + benefit;
      
      double tax1 = total * 0.03;
      double tax2 = total * 0.02;
      double tax3 = total * 0.01;
      double tax = (boolean)(total>=5000000)? tax1 : (total>=3000000) ? tax2 : tax3;
      
      //double tax = tax1, tax2, tax3;
      
      System.out.println("    *** "  + name + "\s" +  rank + " 월급 ***" );
      System.out.println("기본급 : " + df.format(basicmoney));
      System.out.println("수당 : " + df.format(benefit));
      System.out.println("합계 : " + df.format(total));
      System.out.println("세금 : " +  df.format((int)tax));
      System.out.println("월급 : " + df.format(total-tax));
      
      scan.close();
      
   }

}

/*[문제] 월급 계산 프로그램 
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[조건] 
- 조건 연산자
1. 합계가 5,000,000원 이상이면 3% (0.03)
       3,000,000원 이상이면 2%(0.02)
       아니면 1%(0.01)
2. 숫자는 3자리마다 , 표시
3. 소수 이하는 처리 ㄴㄴ

[실행결과]
scanner
scan.nextInt()정수
scan.nextDouble()실수
scan.next() 또는 scan.nextLine()
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원

변수명 - 입력 - 처리 - 출력
*/



