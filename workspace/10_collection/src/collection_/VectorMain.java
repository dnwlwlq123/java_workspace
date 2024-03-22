package collection_;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("백터 크기 = " + v.size());
		System.out.println("백터 용량 = " + v.capacity());
		System.out.println();

		System.out.println("항목 추가");
		for(int i=1; i<=10; i++) {
			v.add(i + " ");
			System.out.println(v.get(i-1) + "  ");
		}
		System.out.println();
		System.out.println("백터 크기 = " + v.size());
		System.out.println("백터 용량 = " + v.capacity());
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5+"");
		System.out.println("백터 크기 = " + v.size());
		System.out.println("백터 용량 = " + v.capacity());
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i) + "");
		}
		System.out.println();
		
		System.out.println("마지막 항목 삭제");
		v.remove("5"); //처음에 만나는 5를 삭제
		//v.remove(10); //index 번호 10번을 삭제    index는 0부터 시작
		
		
		Iterator<String> iterator = v.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + "  ");
		}
		System.out.println();
		
	}

}
