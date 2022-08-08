package com.javaex.ch2;

public class Student extends Person{

	private String schoolName;

	public Student() {
		//super(); //부모클래스의 생성자를 먼저 호출한다.
		System.out.println("Student() 호출");

	}

	public Student(String schoolName) {
		//super(); 생략가능 -> 자식클래스의 객체는 부모클래스의 객체를 무조건 생성하게 되어있기때문에.
		this.schoolName = schoolName;
		System.out.println("Student(String schoolName) 호출");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(String name, int age, String schoolName) 호출");

	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//부모 클래스의 멤버변수에 접근하기 위해서 'super'키워드를 쓴다
	public void showInfo() {
		System.out.println("Student [schoolName=" + super.getName() + ", 나이: " + super.getAge() + ", 학교이름: " + this.schoolName +"]");
	}
	
	
}
