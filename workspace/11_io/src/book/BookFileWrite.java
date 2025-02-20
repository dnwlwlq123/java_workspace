package book;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class BookFileWrite implements Book {

	@Override
	public void execute(ArrayList<BookDTO> list){
		System.out.println();
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
			
			//List를 파일에 저장
			oos.writeObject(list);
			
			//List에서 BookDTO꺼낸 다음 파일에 저장
			//for(BookDTO bookDTO : list) {
			//	oos.writeObject(bookDTO);
			//}
			
			oos.close();
			
			System.out.println("모든 항목을 파일에 저장하였습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
