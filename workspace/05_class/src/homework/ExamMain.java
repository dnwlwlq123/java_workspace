package homework;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("인원수 입력 : ");
		int size = scan.nextInt();
		Exam[] ar = new Exam[size]; //객체 배열 생성
		
		for(int i=0; i<size; i++) {
			ar[i] = new Exam();
			ar[i].compare();
			System.out.println();
		}
		
		
		
		System.out.println("이름\t1 2 3 4 5\t점수");
		for (Exam data : ar) {
			data.compare(); 
			System.out.print(data.getName() + "\t");
			
			for (char result : data.getOx()) {
				System.out.print(result + " ");
			}
			System.out.println("\t" + data.getScore());
		}

	}

}


/*
[문제] 사지선다형
- 총 5문제의 답을 입력받는다
- 정답은 "11111" 이다
- 맞으면 'O', 틀리면 'X'

클래스명 : Exam
* 필드
private String name = null;
private String dap = null;
private char[] ox = null;
private int score = 0;
private final String JUNG="11111"; //final을 넣으면 값을 절대 못바꿈 //상수화

* 메소드
생성자 - Scanner 써서 이름, 답을 입력 받는다.
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
인원수 입력 : 3

이름 입력 : 홍길동
답 입력 : 12311 
    
이름 입력 : 김태리
답 입력 : 12341

이름 입력 : 유연석
답 입력 : 12111                                                                                                                                                                                                                                                                       

이름		1 2 3 4 5	점수
홍길동  	O X X O O	60
김태리  	O X X X O	40
유연석  	O X O O O	80
*/