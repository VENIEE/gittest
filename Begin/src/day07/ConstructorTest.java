package day07;

public class ConstructorTest {

	public static void main(String[] args) {
		//Person객체 1개 생성하고 이름,나이 출력하기
		Person p1=new Person();//기본생성자 호출
		System.out.println("p1.name: "+p1.name);
		System.out.println("p1.age: "+p1.age);
		
		//Person객체 1개 더 생성하되 인자생성자를 호출해서 생성한 뒤 이름, 나이 출력하기
		Person p2=new Person("정성호");
		System.out.println("p2.name: "+p2.name);
		System.out.println("p2.age: "+p2.age);
		
		Person p3=new Person("이순신",22);
		System.out.println("p3.name: "+p3.name);
		System.out.println("p3.age: "+p3.age);
		
		Person p4=new Person(27,"강감찬");
		System.out.println("p4.name: "+p4.name);
		System.out.println("p4.age: "+p4.age);
	}

}
