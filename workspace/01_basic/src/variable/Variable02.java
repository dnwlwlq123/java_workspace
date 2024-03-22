package variable;

public class Variable02 {
	int a; //필드값(초기값0으로 가짐)static 차이 (인스턴스 변수)
	static int b; // (클래스 변수)
	static double c;
	static String str;
	
	public static void main(String[] args) {
		int a = 100; //쓰레기값 (지역변수)
		
		System.out.println("지역변수 a = " + a);
		System.out.println("필드 a = " + new Variable02().a);
		System.out.println("필드 b = " + b);
		System.out.println("필드 c = " + c);
		System.out.println("필드 str = " + str);
		
	}
}
