package abstract_;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
	
	Scanner scan = new Scanner(System.in);
	private int year;
	private int month;
	 

	public CalendarEx(){
		System.out.print("년도 입력 : ");
        year = scan.nextInt();	
        System.out.print("월 입력 : ");
        month = scan.nextInt();
	}
	public void display() {
    	
    	System.out.println("\t["+year+"년\s\s"+month+"월\s\s달력]");
    	System.out.println("-----------------------------");
    	System.out.println("일   월   화   수   목   금   토");
    	
    }
	public void calc() {
		Calendar cal = Calendar.getInstance(); 
		cal.set(year, month-1 ,1);

	    int last = cal.getActualMaximum(Calendar.DATE);
	    int week = cal.get(Calendar.DAY_OF_WEEK);
	    
	    
	    for (int j = 1; j < week; j++) {
	        System.out.print("    ");
	    }
	    for (int i = 1; i <= last; i++) {
	        if (i < 10) {
	            System.out.print(" ");
	        }
	        System.out.print(" " + i + " ");
	        
	        if (week % 7 == 0) {
	            System.out.println();
	        }
	        week++;   
	    }   
	    System.out.println();
	    System.out.println("-----------------------------");
	}
	
}

/*
[문제] 만년달력

클래스명 : CalendarEx
[필드]
필드는 원하는 만큼
[메소드] 
생성자 : 년도, 월을 입력 
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 찾아서 수행 java api 8)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
                -> 시작점 중요, 끝나는 지점 중요(for문 돌리면됨)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31
mport java.util.*;

public class CalendarInputPrintExec {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("년도를 입력하세요 : ");
		int year = sc.nextInt(); //년도
		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt(); //월

		cal.set(Calendar.YEAR, year); //입력받은 년도로 세팅
		cal.set(Calendar.MONTH, month); //입력받은 월로 세팅

		System.out.println("---------["+year+"년 "+month+"월]---------");
		System.out.println("   일      월      화      수      목     금      토");

		cal.set(year,month-1,1); //입력받은 월의 1일로 세팅
		                         //month는 0이 1월이므로 -1을 해준다
		  
		int end = cal.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //해당 날짜의 요일(1:일요일 … 7:토요일)
		

		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if(i<10) { //한자릿수일 경우 공백을 추가해서 줄맞추기
				System.out.print(" ");
			}
			System.out.print(" "+i+" ");
			if(dayOfWeek%7==0) { //한줄에 7일씩 출력
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println("-----------------------------");
		
		
	} //main
} //CalendarInputPrintExec
출처: https://seongsillvanas.tistory.com/10 [Hello World!:티스토리]
*/