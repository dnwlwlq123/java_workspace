package class2;

import java.util.StringTokenizer;
public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 = " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
		}
		System.out.println("--------------------------------");
		
		String[] ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}

	}

}
//문자열을 분배하는것을 토큰이라고함