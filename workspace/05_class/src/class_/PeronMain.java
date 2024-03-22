package class_;

class Person{
	private String name;
	private int age;
	
	
	public void setName(String n) {
		
	name = n;
	}	
	public void setAge(int a) {
		
	age = a;
	}
	public void setData(String n, int a) {
	name=n;
	
	age=a;
	}
	public void setData() {//위에꺼랑 오버로드
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	

}
//-------------------------


public class PeronMain {
	
	public static void main(String[] args) {
		Person aa = new Person();
		System.out.println("객체aa = " + aa);
		aa.setName("홍길동"); //호출
		aa.setAge (25);
		System.out.println(aa.getName() + "\t" + aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		System.out.println("객체bb = " + bb);
		bb.setName("코난");
		bb.setAge(13);
		System.out.println(bb.getName() + "\t" + bb.getAge());
		
		Person cc = new Person();
		System.out.println("객체 cc = " + cc);
		cc.setData("라이언", 30);
		System.out.println(cc.getName() + "\t" + cc.getAge());
		
		Person dd = new Person();
		System.out.println("객체 cc = " + cc);
		dd.setData();
		System.out.println(dd.getName() + "\t" + dd.getAge());
	
	}
	

}



