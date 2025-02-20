package book;

import java.util.ArrayList;
import java.util.Scanner;



public class BookInsert implements Book{

	@Override
	public void execute(ArrayList<BookDTO> list) {
		 System.out.println();
		 Scanner scan = new Scanner(System.in);
		 
		 
		 System.out.print("책 코드 입력 : ");
		 String code = scan.next();
		 System.out.print("책 제목 입력 : ");
		 String title = scan.next();
		 System.out.print("책 저자 입력 : ");
		 String author  = scan.next();
		 System.out.print("책 가격 입력 : ");
		 int price = scan.nextInt();
		 System.out.print("책 수량 입력 : ");
		 int qty = scan.nextInt();	

		 
		 
		 BookDTO bookDTO = new BookDTO(code, title, author, price, qty);

		 list.add(bookDTO);
		 
		 bookDTO.calc();
		 
		 System.out.println("입력되었습니다.");
		
	
	}

}
