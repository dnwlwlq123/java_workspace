package nested;

public class AbstractMain {

	public static void main(String[] args) {
		//AbstractTest abstractTest = new AbstractTest(); //추상 클래스이기 때문에 new하면 안된다....
		
		
		AbstractTest abstractTest = new AbstractTest() {//익명 Inner Class
			
		@Override
			public void setName(String name) { //구현
			
			this.name = name;
			}
		
		};
		
		//interface생성 
		InterA interA = new InterA() {
		
			@Override
		public void aa() {
			
			}
			@Override
		public void bb() {
			
			}
		};
		
		//추상 메소드가 없는 추상클래스 생성
		AbstractExam ae = new AbstractExam() {};
			//원하는메소드 Override
	}
}

























