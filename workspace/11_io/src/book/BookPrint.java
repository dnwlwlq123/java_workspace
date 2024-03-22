package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class BookPrint implements Book{

	@Override
	public void execute(ArrayList<BookDTO> list) throws IOException {
		System.out.println();
		
		ArrayList<BookDTO> totalList = new ArrayList<BookDTO>();
		
		int i=0;
		
		Iterator<BookDTO> it = list.iterator();
		
		while(it.hasNext()) {
			
			

			BookDTO bookDTO = it.next();
			if(totalList.size() == 0) {
				totalList.add(bookDTO);
			}
			
			 if(totalList.get(i).getCode().equals(bookDTO.getCode())) {
				int plus = totalList.get(i).getQty() + bookDTO.getQty();	
				totalList.get(i).setQty(plus); 	
				 
			
			}
			
			 else {
				totalList.add(bookDTO);	
				
				
			}
			
		}//while
		
		
		System.out.println("책 코드\t책 제목\t책 저자\t책 가격\t책 수량\t합계");
		System.out.println();
		
		for(BookDTO bookDTO : totalList) {
			System.out.println(bookDTO);
			
		}
		totalList.clear();
	}
}
