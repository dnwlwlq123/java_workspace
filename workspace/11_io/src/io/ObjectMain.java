package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		PersonDTO  personDTO = new PersonDTO("홍길동", 25, 185.3);
		
		
		//파일로 저장
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(personDTO);
		oos.close();
		
		//파일로부터 읽기
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO personDTO2 = (PersonDTO) ois.readObject();
		System.out.println("이름 = " + personDTO.getName());
		System.out.println("나이 = " + personDTO.getAge());
		System.out.println("키 = " + personDTO.getHeight());

		ois.close();
		

	}

}
