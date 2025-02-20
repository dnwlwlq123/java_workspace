package inheritance;

enum Color {
	RED, GREEN, BLUE
}

//----------------------------------------
class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "호랑이";
	public static final String ANIMAL2;
	
	//public static final int RED = 0;
	//public static final int GREEN = 1;
	//public static final int BLUE = 2;

	static {
		ANIMAL2 = "기린";
	}
	
	public Final() {         //static은 생성자에서 초기화못함 절대
		FRUIT2 = "딸기";
	}
}
//------------------------
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25;
		//AGE++; = error (상수값이라 못바꿈)
		System.out.println("AGE = " + AGE);
		
		final String NAME;
		NAME = "홍길동";
		//NAME = "코난"; error
		System.out.println("NAME = " + NAME);
		System.out.println();
		
		Final fi = new Final();
		System.out.println("FRUIT = " + fi.FRUIT);
		System.out.println("FRUIT2 = " + fi.FRUIT2);
		System.out.println();
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL = " + Final.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = " + Color.RED);
		System.out.println("초록 = " + Color.GREEN.ordinal());
		System.out.println("파랑 = " + Color.BLUE);
		System.out.println();
		for(Color data: Color.values()) {
			System.out.println(data.ordinal() + " : " + data);
		}

	}

}
