package nested;

public class Outer {
	private String name;  //객체를 생성하면 Inner클래스로 접근가능
	
	
	public void output() {
		System.out.println("이름 = " + name + "\t나이 = " + new Inner().age);
	}
	class Inner{
		private int age;

		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t나이 = " + age);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name = "홍길동";
		
		Inner inner = outer.new Inner();
		inner.age = 25;
		inner.disp();
		
		//inner.name = "코난";  error, 접근 X
		Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();
		
		Inner inner3 = new Outer().new Inner();
		inner3.age = 35;
		inner3.disp();

	}

}
