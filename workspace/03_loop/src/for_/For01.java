package for_;

public class For01 {

	public static void main(String[] args) {
		//System.out.println("Hello");
		int i;
		for( i=1; i<=10; i++) {
			System.out.println("Hello : " + i);      
		}
		System.out.println("탈출 i = " + i);
		System.out.println();
		
		for(i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(i='A'; i<='Z'; i++) {
			System.out.print((char)i + " ");
		}
			System.out.println();
			
	}

}
