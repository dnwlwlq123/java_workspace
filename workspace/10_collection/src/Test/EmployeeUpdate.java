package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeUpdate implements Employee{

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		
		System.out.println();
		Scanner scan = new Scanner(System.in);

		System.out.println("사원 번호 입력 : ");
		int number = scan.nextInt();

		boolean found = false;
		for(EmployeeDTO employeeDTO : list) {
		
			if(employeeDTO.getNumber() == number) {
				found = true;
				System.out.println("사원번호\t이름\t직급\t기본급\t\t수당\t\t합계\t\t세율\t\t세금\t\t월급");
				System.out.println(employeeDTO);
				System.out.println();
                System.out.println("수정할 직급 입력: ");
                String rank = scan.next();
                System.out.println("수정할 기본급 입력: ");
                int basicmoney = scan.nextInt();
                System.out.println("수정할 수당 입력: ");
                int extra = scan.nextInt();
               
                //수정
                employeeDTO.setRank(rank);
                employeeDTO.setBasicmoney(basicmoney);
                employeeDTO.setExtra(extra);
			
                employeeDTO.calc();// calc 총점, 평균 계산

       		 	System.out.println("사원정보가 성공적으로 업데이트되었습니다.");  
       		 	
       		 	break;
			}		
		}
	}
}
