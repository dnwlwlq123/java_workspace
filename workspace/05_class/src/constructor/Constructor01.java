package constructor;

class Hello{
	private String name;
	private int age;
	
	public Hello(){
		System.out.println("기본 생성자");
	}
	public Hello(String name) {
		this();
		System.out.println("이름 생성자");
		this.name = name;	
	}
	public Hello(int age) {
		this("코난");	
		System.out.println("나이 생성자");//Overload 된 다른 생성자를 호출 무조건 첫번째 줄에 호출
		this.age = age;	
	}
		
	
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
		
	}
}

//----------------------

public class Constructor01 {

	public static void main(String[] args) {
		Hello aa = new Hello();
		System.out.println(aa.getName()+"\t"+aa.getAge());
		
		Hello bb = new Hello("홍길동");
		System.out.println(bb.getName()+"\t"+bb.getAge());
		
		Hello cc = new Hello(25);
		System.out.println(cc.getName()+"\t"+cc.getAge());
		
	}

}
/*         생성자
 * 1. 생성자는 클래스 명과 똑같이
 * 2. 생성자는 강제호출이 안됨 new 할때 한번 호출
 * 3. 생성자는앞에 return 타입이 없음
 * 4. 생성자도 오버로드 가능 (default 생성자)(데이터를 가지고 있는 생성자)
 * 5. 클래스 안에 생성자가 하나도 없으면 자동으로 기본 생성자 호출 
 * 6. 생성자끼리만 부를 수 있음
 */
