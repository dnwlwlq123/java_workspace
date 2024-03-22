package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class BookSort implements Book{

	@Override
	public void execute(ArrayList<BookDTO> list) {
		
		Comparator<BookDTO> com =  new Comparator<BookDTO>() {
			@Override
			public int compare(BookDTO s1,  BookDTO s2) {
				return s1.getTitle().compareTo(s2.getTitle());  
			}
		};
		Collections.sort(list, com);
		System.out.println("정렬 후 : ");
		System.out.println("책 코드\t책 제목\t책 저자\t책 가격\t책 수량\t합계");
		for(BookDTO bookDTO : list) {
			System.out.println(bookDTO);
			}
		System.out.println();
		}
	}


