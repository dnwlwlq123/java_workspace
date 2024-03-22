package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("호랑이");
		collection.add("사자");
		collection.add("호랑이"); 	//중복허용, 순서도 배열처럼 맞게 들어감
		collection.add(25);
		collection.add(43.8);
		collection.add("기린");
		collection.add("코끼리");
		
		Iterator it = collection.iterator();//생성
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
