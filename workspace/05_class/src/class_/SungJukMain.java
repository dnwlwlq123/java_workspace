package class_;

public class SungJukMain {

	public static void main(String[] args) {
		
		
		System.out.println(" 실 행 결 과 ");
		System.out.println("--------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		SungJuk aa = new SungJuk();
		aa.setData("홍길동", 90, 95, 100); //호출
		aa.Calc();
		System.out.println(aa.getName() + "\t" 
						+ aa.getKor() + "\t" 
						+ aa.getEng()+ "\t" 
						+ aa.getMath()+ "\t" 
						+ aa.getTot() + "\t" 
						+ String.format(("%.2f"), aa.getAvg())+ "\t" 
						+ aa.getGrade());
		
		//-------------------------------------
		SungJuk bb = new SungJuk();
		bb.setData("라이언", 80, 65, 72); //호출
		bb.Calc();
		System.out.println(bb.getName() + "\t" 
						+ bb.getKor() + "\t" 
						+ bb.getEng()+ "\t" 
						+ bb.getMath()+ "\t" 
						+ bb.getTot() + "\t" 
						+ String.format(("%.2f"), bb.getAvg())+ "\t" 
						+ bb.getGrade());
		
		//-------------------------------------
		SungJuk cc = new SungJuk();
		cc.setData("프로도", 60, 50, 95); //호출
		cc.Calc();
		System.out.println(cc.getName() + "\t" 
						+ cc.getKor() + "\t" 
						+ cc.getEng()+ "\t" 
						+ cc.getMath()+ "\t" 
						+ cc.getTot() + "\t" 
						+ String.format(("%.2f"), cc.getAvg())+ "\t" 
						+ cc.getGrade());
	}

}
/*
[문제] 성적처리
클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
	   getName()
	   getKor()
	   getEng()
	   getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동	     90		 95		100
*/
