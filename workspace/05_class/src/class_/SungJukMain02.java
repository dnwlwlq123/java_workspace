package class_;

public class SungJukMain02 {

	public static void main(String[] args) {
		
		SungJuk[]ar = new SungJuk[3]; //객체 배열 생성
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setData("홍길동", 90, 95, 100);
		ar[1].setData("라이언", 80, 65, 72);
		ar[2].setData("프로도", 60, 50, 95);
		
		for(SungJuk data : ar) {
			data.Calc();
			
			System.out.println(data.getName() + "\t" 
					+ data.getKor() + "\t" 
					+ data.getEng()+ "\t" 
					+ data.getMath()+ "\t" 
					+ data.getTot() + "\t" 
					+ String.format(("%.2f"), data.getAvg())+ "\t" 
					+ data.getGrade());
		System.out.println("------------------------------------------");
		}
		/*for(int i=0; i<ar.length ;i++) {
			ar[i].Calc();
			
			System.out.println(ar[i].getName() + "\t" 
					+ ar[i].getKor() + "\t" 
					+ ar[i].getEng()+ "\t" 
					+ ar[i].getMath()+ "\t" 
					+ ar[i].getTot() + "\t" 
					+ String.format(("%.2f"), ar[i].getAvg())+ "\t" 
					+ ar[i].getGrade());
		System.out.println("------------------------------------------");
	}*/
	}
}
