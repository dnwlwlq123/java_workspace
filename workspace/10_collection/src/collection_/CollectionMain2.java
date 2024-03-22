package collection_;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("호랑이");
		arraylist.add("사자");
		arraylist.add("호랑이"); 	//중복허용, 순서도 배열처럼 맞게 들어감
		//arraylist.add(25);
		//arraylist.add(43.8);
		arraylist.add("기린");
		arraylist.add("코끼리");
		
		for (int i=0; i<arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}//for
		System.out.println("-----------------");
		
		for(String data : arraylist) {
			System.out.println(data);
		}//for

	}

}
