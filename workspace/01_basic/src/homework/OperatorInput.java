package homework;

import java.io.IOException;

public class OperatorInput {

   public static void main(String[] args) throws IOException {
      System.out.print("문자 입력 : ");
      char ch = (char) System.in.read();
      System.in.read();
      
      
       //char ch1 = Character.toUpperCase(ch);
       //char ch2 = Character.toLowerCase(ch);
        
        //System.out.println(ch>='A' && ch<='Z' ? ch+32 : ch-32 );
        
        
       
        int result = ch>='A' && ch<='Z' ? ch+32 : ch-32;
         System.out.println(ch + "- >" + (char)(result));
      
      
      
      
   }

}

/*
[문제] 
문자를 입력하여 대문자이면 소문자로 변경 후 출력하고 
만약에 대문자가 아니면 대문자로 변경 후 출력 하시오

[조건] 
반드시 System.in.read(), 조건연산자를 사용하시오

[실행결과]
문자 입력 : T
T -> t
또는
문자 입력 : e
e -> E 
*/
