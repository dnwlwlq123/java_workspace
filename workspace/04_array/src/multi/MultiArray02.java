package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		int num = 0;
		
		//입력
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
			num++;
			ar[j][i] = num;
			}
			
		//출력
	
		
		//for(int i=0; i<ar.length; i++) {
			//for(int j=0; j<ar.length; j++) {
	
				//System.out.print(String.format("%4d", ar[i][j]));
			//}			
			System.out.println();
		}
	}
}
