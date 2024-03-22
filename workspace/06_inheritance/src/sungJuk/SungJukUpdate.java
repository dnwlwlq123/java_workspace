package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);

		System.out.println("번호 입력 : ");
		int no = scan.nextInt();
		
		boolean found = false;
		for(SungJukDTO sungJukDTO : list) {
		
			if(sungJukDTO.getNo() == no) {
				found = true;
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO);
				System.out.println();
			
        	 	System.out.println("수정할 이름 입력: ");
                String name = scan.next();
                System.out.println("수정할 국어 입력: ");
                int kor = scan.nextInt();
                System.out.println("수정할 영어 입력: ");
                int eng = scan.nextInt();
                System.out.println("수정할 수학 입력: ");
                int math = scan.nextInt();
               
                //수정
                sungJukDTO.setName(name);
                sungJukDTO.setKor(kor);
                sungJukDTO.setEng(eng);
                sungJukDTO.setMath(math);
			
                sungJukDTO.calc();// calc 총점, 평균 계산

       		 	System.out.println("데이터가 성공적으로 업데이트되었습니다.");  
       		 	
       		 	break;
			}
	
			}//for
			if(!found) System.out.println("잘못된 번호입니다.");
			
	
		}
        	
}  
       
	     
	







