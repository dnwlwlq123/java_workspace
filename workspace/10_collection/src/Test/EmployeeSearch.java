package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSearch implements Employee{

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		
		for(EmployeeDTO employeeDTO : list) {
		
			if(employeeDTO.getName().equals(name)) {
			
				System.out.println("사원번호\t이름\t직급\t기본급\t\t수당\t\t합계\t\t세율\t\t세금\t\t월급");
				System.out.println(employeeDTO);
				System.out.println();

       		 	break;
			}		
		}
		
	}

}
