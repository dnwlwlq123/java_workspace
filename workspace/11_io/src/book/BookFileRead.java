package book;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;



public class BookFileRead implements Book{

	@Override
	public void execute(ArrayList<BookDTO> list) {
		System.out.println();
		
		list.clear(); //초기화
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));

			//파일에서 새로운 List를 읽은 다음 기존에 있는 List 항목 담기
			ArrayList<BookDTO> load = (ArrayList<BookDTO>) ois.readObject();
			for(BookDTO bookDTO : load) {
				list.add(bookDTO);
			}//for
			
			// 파일에서 BookDTO를 1개씩 꺼내서 List 에 담기 			
			//while(true) {
			//	try {
			//		BookDTO bookDTO = (BookDTO)ois.readObject();
			//		list.add(bookDTO);
			//	}catch(EOFException e) {
			//		break;
			//	}
			//}
			
			ois.close();
			
			System.out.println("파일에서 모든 항목을 로드하였습니다.");

		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
