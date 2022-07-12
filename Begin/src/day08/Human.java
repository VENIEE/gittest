package day08;
//부모클래스: Super class, Base class
public class Human {//묵시적으로 extends Object 하고 있음
	String name;
	int height;
	
	public Human() {
		this("아무개", 155);
	}
	
	public Human(String n, int h) {
		name=n;
		height=h;
	}
	
	public String getInfo() {
		return "이름: "+name+"\n 키: "+height;
	}

}
