package multi;

public class MultiFor03 {

	public static void main(String[] args) {
		int dan;
		int i;
		System.out.println("2단~ 9단 구구단");
	for(dan=1; dan<=9; dan++) {
			
			for(i=2; i<=9; i++) {
				System.out.print(i + "*" + dan + "=" + dan*i + "\t");
			}//for j
			
			System.out.println();
			
		}//for i 
	}

}
