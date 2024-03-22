package class_;


public class SalaryDTO {
	
	private String name;
	private String job;
	private int basic;
	private int extra;
	private int total;
	private double rate;//세율
	private int tax;
	private int salary;
	
	public void setData(String n, String j, int b, int e) {
		
		name = n;
		job = j;
		basic = b;
		extra = e;	
	}
	public void calc() {
		
		total = basic + extra;
	
		if(total>=5000000) { 
			rate = 0.03;
		}
		else if(total>=3000000) {
			rate = 0.02;
			}
		else 
			rate = 0.01;
		
		tax = (int)(total*rate);
		
		salary =  (int)(total - (total*rate));
	
	}
		public String getName() {
			return name;
		}
		public String getJob() {
			return job;
		}
		public int getBasic() {
			return basic;
		}
		public int getExtra() {
			return extra;
		}
		public int getTotal() {
			return total;
		}
		public double getRate() {
			return rate*100;
		}
		public int getTax() {
			return tax;
		}
		public int getSalary() {
			return salary;
		}
		
}


	
/*필드 : name, job, basic, extra, total, rate, salary
	메소드 : setData(이름, 직급, 기본급, 수당)
	       calc() - 합계, 세율, 월급 계산
		   getName()
		   getJob()
		   getBasic()
		   getExtra()
	       getTotal()
	       getRate()
	       getSalary()
	       [문제] 월급 계산
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[조건]
1. 조건 연산자 이용
합계가 5,000,000원 이상이면 3% (0.03)
     3,000,000원 이상이면 2% (0.02)
     아니면 1% (0.01)
2. 숫자는 3자리마다 , 표시
3. 소수이하는 표시하지 않는다. (정수형)
	       */

