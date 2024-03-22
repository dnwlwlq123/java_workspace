package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDelete implements Employee{

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 사원번호 입력 : ");
		int number = scan.nextInt();
		
		int count = 0;
		/*
		for(int i=0; i<list.size(); i++) {

			if(list.get(i).getName().equals(name)){
				count++;
			list.remove(list.get(i));
		}
	  } //for
	  */
		
		Iterator<EmployeeDTO>it = list.iterator();//
		while(it.hasNext()) { //hasNext : 항목을 보겠다 
			EmployeeDTO employeeDTO = it.next(); //현재위치의 항목을 꺼내서 저장하고 다음 항목으로 이동
			if(employeeDTO.getNumber()==number) {
				it.remove();//it.next()로  보관했던 항목을 제거
				
			}
		}//while
		if(count == 0 ) System.out.println("삭제하였습니다");
		
		
	}

}
