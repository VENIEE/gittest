package day02;
import java.util.Date;

public class ReferenceType {
	
	public static void main(String[] args) {
		System.out.println("--참조형(reference type)---");
		/*[1] 클래스형: String, Date,..
		 *[2] 인터페이스형
		 *[3] 배열: String[], int[]..
		 *: 참조형은 반드시 new 연산자로 객체를 생성해서 사용해야 한다 
		 * 단 예외가 있다. String의 경우 기본자료형처럼 문자열 값(literal)을 직접 할당 can.
		 * */
		String s1 = new String("Java");//생성자
		System.out.println("s1="+s1);
		
		Date today = new Date(); //참조형
		System.out.println("today="+today);
		
		String s2 = "Hello";
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		/*기본자료형: 주로 연산에 사용된다
		 * 참조형: [데이터(변수)+기능(메소드)]
		 */
		
		int a=20;
		int b = 30;
		System.out.println(a+b+"<=합"); //50
		System.out.println("합=>"+a+b); //2030
	}

}
