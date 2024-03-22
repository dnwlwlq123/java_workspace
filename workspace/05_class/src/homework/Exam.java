package homework;

import java.util.Scanner;

public class Exam {
	private String name = null;
	private String dap = null;
	private char[] ox = null;
	private int score = 0;
	private final String JUNG="11111";
	

	public Exam() {
		Scanner scan = new Scanner(System.in);	
 
        System.out.print("이름 입력 : ");
        this.name = scan.next();
        System.out.print("답 입력 : ");
        this.dap = scan.next();
        
        ox = new char[JUNG.length()]; 
    }
	 public void compare() {
	        for (int i = 0; i < JUNG.length(); i++) {
	            if (JUNG.charAt(i) == dap.charAt(i)) {
	                ox[i] = 'O';
	                score += 20;
	            } else {
	                ox[i] = 'X';
	                
	            }
	        }
	    }
	 
	public String getName() {
		return name;
	}
	//public String getDap() {
		//return dap;
	//}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
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
private final String JUNG="11111"; //상수화

* 메소드
생성자 - Scanner 쓰기
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
이름 입력 : 홍길동
답 입력 : 12311                                                                                                                                                                                                                                                                           

이름		1 2 3 4 5	점수
홍길동  	O X X O O	60
*/