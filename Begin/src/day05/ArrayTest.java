package day05;

/* 기본자료형 (primitive type)
 * 	- 숫자형 (정수형-byte, short, int, long, 실수형-float, double)
 *  - 문자형 (char) 
 *  - 논리형 (boolean) true, false
 * 
 * 참조형(reference type)- 클래스형, 인터페이스형, 배열
 *  - String(문자열)
 *  String s=new String("java");
 *  String s2="hello"
 *  - Date
 *  Date d=new Date()
 *  - Scanner
 *  Scanner sc=new Scanner(System.in);
 * 
 *  if, if~else,  if else if....else
 *  switch~case
 *  for, while, do~while
 * */

public class ArrayTest {

	public static void main(String[] args) {
		
		System.out.println("1.-----------");
		int a=1; //기본자료형-정수
		int [] b;//참조형-1차원 배열
		
		/*1. 선언
		 * 2. 메모리할당
		 * 3.초기화
		 */
		
		int c []; //선언. int c[3] 안된다
		
		//2 메모리할당-> new연산자 이용
		c = new int[3]; //배열 크기 정한다
		
		//3 초기화: index를 이용해 데이터 저장
		c[0]=10;
		c[1]=20;
		c[2]=30;
		
		System.out.println(c); //배열 주소값 출력
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);

	}

}
