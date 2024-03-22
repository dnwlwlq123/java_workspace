package abstract_;

public abstract class AbstractTest { //POJO 형식 (Plain Old Java Object)
 
	 String name;

	public String getName() { //구현
		return name;
	}

	public abstract void setName(String name); //추상 메소드
	
}

/*추상클래스 안에는 추상메소드가 있을 수 도 있고 없을 수 도 있다
 * 추상메소드가 있는 추상 클래스는 new 가 안됨
 */

