package io;

import java.io.Serializable;

public class PersonDTO  implements Serializable{   //직렬화 작업 알아서 다함 유일하게 추상메소드 없음

	private String name;
	private int age;
	private double height;
	
	public PersonDTO(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
