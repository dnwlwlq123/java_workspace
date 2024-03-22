package multi;

public class MultiFor02 {

	public static void main(String[] args) {
		int dan;
		int i;
		System.out.println("2단~ 9단 구구단");
	for(dan=2; dan<=9; dan++) {
			
			for(i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}//for j
			
			System.out.println();
			
		}//for i

	}
}



