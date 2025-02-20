package book;

import java.io.IOException;
import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BookService bookService = new BookService();
		bookService.menu();
		
		System.out.println("프로그램을 종료합니다.");

	}

}


/*메뉴
1. 등록
2. 출력
3. 파일 저장
4. 파일 읽기
5. 책 제목으로 내림 차순 정렬
6. 끝


입력 할 때 데이터 중복 허용
조건 : book01  자바	김자바	35000	10	
      book02  스프링 	이봄	    40000	5	
      book01  자바 	김자바	35000	8  
      book01  자바 	김자바	35000	2  
      
출력할 때는 같은 데이터는 묶어서 출력        tot
	book01  자바  김자바  35000  20  xxxxxx
	book02  스프링 이봄	   40000  5   xxxxxx
	
파일에 저장할 때 입력한 그대로 저장
*/