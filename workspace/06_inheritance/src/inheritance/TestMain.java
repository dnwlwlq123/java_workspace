package inheritance;

class AA{
	public int a = 3;
	public void disp() {
		 a +=5;
		 System.out.println("AA : " + a + " ");
	}
}
//--------------------------
class BB extends AA{
	public int a = 8;
	public void disp() {
		 this.a +=5;
		 System.out.println("BB : " + a + " ");
	}
}

public class TestMain {

	public static void main(String[] args) {
		BB aa = new BB(); //BB호출했지만 AA까지 호출됨
		aa.disp();
		System.out.println("aa : " +aa.a);//13
		System.out.println();
		
		AA bb = new BB();
		bb.disp(); //부모 = 자식
		System.out.println("bb : " + bb.a);//3
		System.out.println();
		
		BB cc = (BB)bb; //자식 = (자식)부모  부모가 뒤로갈땐 형변환 해야함
		cc.disp();
		System.out.println("cc : " + cc.a);//18
		System.out.println();
		
		AA dd = new AA();
		dd.disp();
		System.out.println("dd : " + dd.a);
		System.out.println();
		
		//BB ee = (BB)dd; //자식 + (자식)부모, java.lang.ClassCastException error
		//ee.disp();-error
		
			
	}

}
