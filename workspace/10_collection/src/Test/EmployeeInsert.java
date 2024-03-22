package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInsert implements Employee{

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		 System.out.println();
		 Scanner scan = new Scanner(System.in);
		 
		 
		 System.out.print("사원 번호 입력 : ");
		 int number = scan.nextInt();
		 System.out.print("이름 입력 : ");
		 String name = scan.next();
		 System.out.print("직급 입력 : ");
		 String rank  = scan.next();
		 System.out.print("기본급 입력 : ");
		 int basicmoney = scan.nextInt();
		 System.out.print("수당 입력 : ");
		 int extra = scan.nextInt();	

		 EmployeeDTO employeeDTO = new EmployeeDTO(number, name, rank, basicmoney, extra);
		 employeeDTO.calc();// calc 총점, 평균 계산
		 
		 list.add(employeeDTO);// list를 DTO<<<<<<<<<저장
		 
		 System.out.println("입력되었습니다.");
		
	}

}
