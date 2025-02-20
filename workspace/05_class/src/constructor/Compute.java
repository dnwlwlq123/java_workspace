package constructor;

public class Compute {
	
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;
	
	public Compute(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void Calc() {
		
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = (double)(x / y);
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;	
	}
	public int getMul() {
		return mul;	
	}
	public double getDiv() {
		return div;	
	}
}
/*
[문제] 합, 차, 곱, 몫을 구하시오
- main 함수에서 데이터를 입력 받는다.
- 몫은 소수이하 2째자리까지 처리
- 객체 배열

클래스명 : Compute
필드   : x, y, sum, sub, mul, div
메소드  : 생성자(x, y)
        calc() - 합, 차, 곱, 몫을 계산
        getX()
		getY()
		getSum()
		getSub()
		getMul()
		getDiv()

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X		Y		SUM		SUB		MUL		DIV
320		258
256		125
452		365
*/