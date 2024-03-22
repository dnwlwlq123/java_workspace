package homework;

import java.util.Scanner;

public class MemberService {
	private MemberDTO[] ar = new MemberDTO[5];
	Scanner scan = new Scanner(System.in);
    public void menu(MemberDTO[] ar) {
    	while (true) {
	
            Scanner scan = new Scanner(System.in);
            System.out.println("menu()");
            System.out.println("*************");
            System.out.println("   1. 가입");
            System.out.println("   2. 출력");
            System.out.println("   3. 수정");
            System.out.println("   4. 탈퇴");
            System.out.println("   5. 끝내기");
            System.out.println("*************");
            System.out.print("  번호 : ");
            int choice = scan.nextInt();
            
            if(choice == 5) break;
            if(choice == 1) insert(ar);
            else if(choice == 2) list(ar);
            else if(choice == 3) update(ar);
            else if(choice == 4) delete(ar);
        }
    }

    public void insert(MemberDTO[] ar) {
    	 int i;
    	 for (i = 0; i < ar.length; i++) {
             if (ar[i] == null) break; 	
             }
           if(i==5)
            System.out.println("5명의 정원이 꽉 찼습니다...");
    	 
           else {
        	   ar[i] = new MemberDTO();
        	   
        	   System.out.println("1 row created");
        }        
    }
    
    
    public void list(MemberDTO[] ar) {
        
        System.out.println("list()");
        System.out.println("이름\t나이\t핸드폰\t주소");
        
        for(int i=0;i<ar.length; i++) {
        	if(ar[i] == null) {	
        	}
        }

        for (MemberDTO member : ar) {
            if (member != null) {
                System.out.println(member);
            }  
        }
    }	

    public void update(MemberDTO[] ar) {

        System.out.print("핸드폰 번호 입력 : ");
        String phoneToUpdate = scan.next();

        boolean found = false;

        for (MemberDTO member : ar) {
            if (member != null && member.getPhone().equals(phoneToUpdate)) {
                System.out.println(member);
                System.out.print("수정 할 이름 입력 : ");
                String newName = scan.next();
                System.out.print("수정 할 나이 입력 : ");
                int newAge = scan.nextInt();
                System.out.print("수정 할 핸드폰 입력 : ");
                String newPhone = scan.next();
                System.out.print("수정 할 주소 입력 : ");
                String newAddress = scan.next();

                member.setName(newName);
                member.setAge(newAge);
                member.setPhone(newPhone);
                member.setAddress(newAddress);

                System.out.println("1 row(s) updated");
                found = true;
               
            }
        }

        if (!found) {
            System.out.println("찾는 회원이 없습니다");
        }
    }

    public void delete(MemberDTO[] ar) {

        System.out.print("핸드폰 번호 입력 : ");
        String phoneToDelete = scan.next();

        boolean found = false;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != null && ar[i].getPhone().equals(phoneToDelete)) {
                ar[i] = null;
                System.out.println("1row delete");
                found = true;
                break;
            }
        }

        if (!found) 
            System.out.println("찾는 회원이 없습니다"); 
    }
}

