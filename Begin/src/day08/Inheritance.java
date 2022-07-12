package day08;
//상속성: inheritance
/*부모 클래스
 * 
 * 자식클래스 extends 부모클래스
 * =>부모클래스가 가진 멤버변수, 메소드를 자식클래스에서 그대로 물려받아 쓸 수 있다
 * 상속은 "is a" 관계가 성립해야 한다
 * - 자바는 1개의 클래스만 상속받을 수 있다(단일상속)
 * C++는 다중상속 가능
 */
public class Inheritance {

	public static void main(String[] args) {
		Human h1 = new Human("홍씨", 180);
		System.out.println(h1.getInfo());
		/*h1의 정보 출력하기
		String s=h1.getInfo();
		System.out.println(s);*/
		
		//슈퍼맨 객체 생성 후 이름, 키, 초능력 값을 할당하고 정보출력=>getInfo()
		System.out.println("--------슈퍼맨---------");
		Superman s1 = new Superman();
		s1.name = "김슈퍼";
		s1.height = 190;
		s1.power = 900;
		
		System.out.println(s1.getInfo());
		
		//슈퍼맨 객체 1개 더 생성해서 이름, 키, 초능력 주고
		//제목을 가진 슈퍼맨 정보 출력하기
		Superman s2 = new Superman("울트라 슈퍼맨",200,2000);
		System.out.println(s2.getInfo("---<<슈퍼맨의 정보>>---"));
		
		//제목을 가진 슈퍼맨 정보 출력하기->초능력을 100 충전해서 출력하기
		s2.getInfo("---<<슈퍼맨 파워 UP>>---", 100);
		
		//아쿠아맨 객체 생성 후 이름,키,스피트 값을 할당하고 정보출력
		System.out.println("-------아쿠아맨---------");
		Aquaman a1 = new Aquaman();
		a1.name = "최아쿠";
		a1.height = 190;
		a1.speed = 80.7;
		
		System.out.println(a1.getInfo());
	}

}
