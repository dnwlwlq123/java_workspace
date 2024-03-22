package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		Zoo z = new Zoo();
		
			z.tiger();
			//z.giraffe();
			//z.elephant();
			//z.lion(); error
			System.out.println();
			
			Safari sa = new Safari();  //자식으로 new 해야함
			sa.tiger();
			sa.giraffe();
			//sa.elephant();
			//sa.lion();

	}

}
