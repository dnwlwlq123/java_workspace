package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
 
	private ArrayList<BookDTO> list = new ArrayList<BookDTO>();
	
	public void menu() throws IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		Book book = null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***********************");
			System.out.println("   1. 등록");
			System.out.println("   2. 출력");
			System.out.println("   3. 파일 저장");
			System.out.println("   4. 파일 읽기");
			System.out.println("   5. 책 제목으로 내림차순 정렬");
			System.out.println("   6. 종료.");
			System.out.println("***********************");
			System.out.println("  번호 : ");
			num = scan.nextInt();
		
			if(num==6) break;
			if(num==1) {
				book = new BookInsert();	
			}else if(num==2) {
				book = new BookPrint();	
			}else if(num==3) {
				book = new BookFileWrite();
			}else if(num==4) {
				book = new BookFileRead();
			}else if(num==5) {
				book = new BookSort();
			}
			else {
				System.out.println("1~6 중에 선택하세요");
				continue;
			}
			book.execute(list); //*****list 를 DTO로 주소 전달
			
		}//while	//list.remove(...)데이터 삭제
	}
	
}
