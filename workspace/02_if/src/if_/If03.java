package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a값 : ");
		int a = scan.nextInt();
		System.out.print("b값 : ");
		int b = scan.nextInt();
		System.out.print("c값 : ");
		int c = scan.nextInt();
		
		if(a<b&&b<c) System.out.println(a+" "+b+" "+c);
		else if(a<c&&c<b) System.out.println(a+" "+c+" "+b);
		else if(b<a&&a<c) System.out.println(b+" "+a+" "+c);
		else if(b<c&&c<a) System.out.println(b+" "+c+" "+a);
		else if(c<a&&a<b) System.out.println(c+" "+a+" "+b);
		else if(c<b&&b<a) System.out.println(c+" "+b+" "+a);
		else System.out.println();
		
		scan.close();
		

	}

}

/*


 */
