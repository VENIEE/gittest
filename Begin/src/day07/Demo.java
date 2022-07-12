package day07;

public class Demo {
	int x=10;//멤버변수(인스턴스변수)
	double pi=3.14;//멤버변수(인스턴스변수)
	
	static String STR="Hello";//클래스변수(static변수)
	
	//멤버 메소드(인스턴스 메소드)
	public void sub() {
		this.x=100;
		this.pi=5.78;
	}
	
	//클래스 메소드-static 메소드
	public static void main(String[] args) {
		//this.x=200; //[x] static메소드 안에서는 this를 사용할 수 없다
		Demo dm=new Demo();
		dm.x=200;//객체명.변수
		System.out.println("dm.x: "+dm.x);
		
		dm.sub();
		System.out.println("dm.x: "+dm.x);
		System.out.println("dm.pi: "+dm.pi);
		
		//STR값을 출력해보기
		System.out.println("Demo.STR: "+Demo.STR);
		System.out.println("dm.STR: "+dm.STR);
	}

}
