package inheritance;

class Test{
	
	@Override
	public String toString(){
		return getClass() + "@개바부";
	}
}
//------------------------------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("사과 : " + str);
		System.out.println("사과 : " + str.toString());
		System.out.println("사과 : " + str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb));//참조값 비교, false
		System.out.println("aa.equals(bb) : " + aa.equals(bb));//문자열 비교, true
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc==dd));//참조값 비교, false
		System.out.println("cc.equals(dd) : " + cc.equals(dd));//참조값 비교, false
		System.out.println();
		
		Object ee = new String();
		Object ff = new String();
		System.out.println("ee==ff : " + (ee==ff));//참조값 비교, false
		System.out.println("ee.equals(ff) : " + ee.equals(ff));//문자열 비교,true
		
		
		
	}

}

/*
class Object {
	public boolean equals (Object obj){} //참조값 비교
	public String toString(){}           // 클@16진수
	public int hashCode(){}              //10진수
}

class String extends Object{
	public boolean equals (Object obj){}//문자열비교
	public String toString(){} //문자열
	public int hashCode(){} //이 10진수 코드는 믿으면 안됨(표현 할 수 있는 문자열은 무한대이기 때문에 10진수 표현을 다 할 수 없다)
}
*/