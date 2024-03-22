package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService implements SungJuk {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk = null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***********************");
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 수정");
			System.out.println("   4. 삭제");
			System.out.println("   5. 정렬");
			System.out.println("   6. 끝.");
			System.out.println("***********************");
			System.out.println("  번호 : ");
			num = scan.nextInt();
		
			if(num==6) break;
			if(num==1) {
				sungJuk = new SungJukInsert();	
			}else if(num==2) {
				sungJuk = new SungJukPrint();	
			}else if(num==3) {
				sungJuk = new SungJukUpdate();
			}else if(num==4) {
				sungJuk = new SungJukDelete();
			}else if(num==5) {
				sungJuk = new SungJukSort();
			}
			else {
				System.out.println("1~6 중에 선택하세요");
				continue;
			}
			sungJuk.execute(list); //*****list 를 DTO로 주소 전달
			
		}//while	//list.remove(...)데이터 삭제
	}

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		// TODO Auto-generated method stub
		
	}
	
}
