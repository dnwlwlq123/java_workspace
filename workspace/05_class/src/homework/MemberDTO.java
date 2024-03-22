package homework;

import java.util.Scanner;

public class MemberDTO { // 1인분

    private String name;
    private int age;
    private String phone;
    private String address;

    public MemberDTO() {
  
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        name = scan.next();
        System.out.print("나이 입력 : ");
        age = scan.nextInt();
        System.out.print("핸드폰 입력 : ");
        phone = scan.next();
        System.out.print("주소 입력 : ");
        address = scan.next();
    }

    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    @Override
    	public String toString() {
    		
    		return name + "\t" + age + "\t" + phone + "\t" + address;
    	}
   
}
