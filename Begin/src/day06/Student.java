package day06;

public class Student {
	int no;
	String name;
	String major;
	int phone;


	public void info() {
		System.out.println("---- 학생정보 ----");
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+no);
		System.out.println("전공 : "+major);
		System.out.println("연락처 : "+phone);
		System.out.println("");

	}
	
	public void status() {
		System.out.println(name+" 학생은 공부 중입니다.");
	}
	
}
