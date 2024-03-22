package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
public class SungJukSort implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		while(true) {
		System.out.println("*****************");
		System.out.println("1. 총점으로 내림차순");
		System.out.println("2. 이름으로 오름차순");
		System.out.println("3. 이전 메뉴");
		System.out.println("*****************");
		
		System.out.print("번호 : ");
		num = scan.nextInt();
		if(num == 3)break;
		if(num == 1) {
			//나이를 기준으로 오름차순
			Collections.sort(list);
			System.out.println("총점 내림차순 결과 : ");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			for(SungJukDTO sungJukDTO : list) {
				System.out.println(sungJukDTO);
			}
			System.out.println();
	
			}
		if(num==2) {
			System.out.println("이름으로 오름차순 결과");
			Comparator<SungJukDTO> com =  new Comparator<SungJukDTO>() {
				@Override
				public int compare(SungJukDTO s1,  SungJukDTO s2) {
					return s1.getName().compareTo(s2.getName()); //내림차순 *-1안쓰고 
				}
			};
			Collections.sort(list, com);
			System.out.println("정렬 후 : ");
			for(SungJukDTO sungJukDTO : list) {
				System.out.println(sungJukDTO);
				}
			System.out.println();
			}
		}
	}
}
