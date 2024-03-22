package array;


public class Array04 {

	public static void main(String[] args) {
		
		int[] ar = new int[10];
		int max, min;
		for(int i=0; i<ar.length; i++) {
			ar[i]= (int)(Math.random()*100+1);
		}

		max = ar[0];
		min = ar[0];
		for(int i=1; i<ar.length; i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min) min = ar[i];
		}
		
		for(int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("최대값 = " + max);
		System.out.println("최솟값 = " + min);
		

	}

}


