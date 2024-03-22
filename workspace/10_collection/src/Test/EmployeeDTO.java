package Test;

import java.text.DecimalFormat;
public class EmployeeDTO implements Comparable<EmployeeDTO>{
	

	private int number;
	private String name;
	private String rank;
	private int basicmoney;
	private int extra;
	
	private int tot;
	private double rate;
	private int tax;
	private int salary;
	
	public EmployeeDTO() {
		
	}
	
	public EmployeeDTO(int number, String name, String rank, int basicmoney, int extra ) {
		this.number = number;
		this.name = name;
		this.rank = rank;
		this.basicmoney = basicmoney;
		this.extra = extra;
	}
	
	public void calc() {
		tot = basicmoney + extra;
		
		if(tot>4000000) { 
			rate = 0.03;
		}
		else if(tot<=4000000) {
			rate = 0.02;
			}
		else if(tot<=2000000)
			rate = 0.01;
		
		tax = (int)(tot*rate);
		
		salary =  (int)(tot - (tot*rate));
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getBasicmoney() {
		return basicmoney;
	}
	public void setBasicmoney(int basicmoney) {
		this.basicmoney = basicmoney;
	}
	public int getExtra() {
		return extra;
	}
	public void setExtra(int extra) {
		this.extra = extra;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat();
		return number + "\t"
			 + name + "\t"
			 + rank + "\t"
			 + df.format(basicmoney) + "\t\t"
			 + df.format(extra) + "\t"
			 + df.format(tot) + "\t"
			 + (String.format("%.2f" ,rate)) + "\t\t"
			 + df.format(tax) + "\t"
			 + df.format(salary) + "\t";
			 
	}

	@Override
	public int compareTo(EmployeeDTO bm) {
		if(this.basicmoney < bm.basicmoney) return 1;
		else if(this.basicmoney > bm.basicmoney) return -1;
		else return 0;
	}
}
