package Test;

import java.util.ArrayList;
import java.util.Collections;



public class EmployeeSort implements Employee{

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		
			Collections.sort(list);
			System.out.println("월급 내림차순 결과 : ");
			System.out.println("사원번호\t이름\t직급\t기본급\t수당\t합계\t세율\t세금\t월급");
			for(EmployeeDTO employeeDTO : list) {
				System.out.println(employeeDTO);
			}
			System.out.println();
	
			}
		
}

