package for_;

public class For03 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			System.out.println(i + "\t" + sum);
			
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			num*=i;
			System.out.println(i + "\t" + num);
			
		}
		System.out.println();

	}

}
