package homework;

import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("현금 입력 : ");
            int money = scanner.nextInt();

            if (money < 1000) {
                System.out.println("다시 입력하세요.");
                continue;
            }

            for (int i = 0; i < money / 1000; i++) {
                int[] lotto = new int[6];
               

                for (int j = 0; j < lotto.length; j++) {
                    lotto[j] = (int) (Math.random() * 45 + 1);

                    for (int k = 0; k < j; k++) {
                        if (lotto[j] == lotto[k]) {
                            j--; 
                            break;
    
                        }                     
                    }                  
                }  
                
                for(int r=0; r<lotto.length-1; r++) {
        			for(int w=r+1; w<lotto.length; w++) {
                if(lotto[r] > lotto[w]) {
					int temp = lotto[r];
					lotto[r] = lotto[w];
					lotto[w] = temp;
                		}
        			}
                }
             
        					for (int data : lotto) {
                                System.out.print(String.format("%4d" , data));
        	
        					}
        				 System.out.println();
        				 if ((i + 1) % 5 == 0) {
        	                    System.out.println();
                              
        		}
        				 
            } 
            
        }
       
    }
    
}



/*
[문제] 로또 프로그램
1~45 사이의 난수를 6개 발생한다.
단, 숫자는 중복이 되어서는 안된다.
1줄당 금액이 천원이다
1줄당 오름차순으로 정렬하여 출력한다

[실행결과]
현급 입력 : 3000     //한줄에 6개  5줄마다 띄워서 출력
[실행결과]
현금 입력 : 3000
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    
현금 입력 : 7000    
   2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    3   14   23   30   34   35
   18   20   25   27   32   37

    1   16   32   34   41   42
    5    6   18   30   33   44
*/
