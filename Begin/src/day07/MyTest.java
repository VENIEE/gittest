package day07;

public class MyTest {

	public static void main(String[] args) {
		//MyDemo클래스의 변수x, y값을 출력하세요
		System.out.println("MyDemo.y: "+MyDemo.y);
		MyDemo md=new MyDemo();
		System.out.println("md.x: "+md.x);
		
		//MyDemo의 foo(), bar() 메소드 호출하기
		MyDemo.foo();
		md.bar();
		
		//MyDemo의 star(), snail() 메소드 호출해서 결과를 출력하세요
		String s=MyDemo.snail();
		System.out.println(s);
		
		String s2=md.star(30);
		System.out.println(s2);
		System.out.println(md.star(20));
	}

}
