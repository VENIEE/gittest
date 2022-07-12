package day02;

public class MyOperator {
	
	public static void main(String[] args){
		System.out.println("1. 산술 연산자");
		
		int a=10;
		System.out.println(a-6);
		System.out.println(a*3);
		System.out.println(a/3);//몫
		System.out.println(a%3);//나머지
		double b=10;
		System.out.println(b/3);
		
		System.out.println("2. Shift 연산자");
		System.out.println(42<<3);
		System.out.println(42>>3);
		System.out.println(42>>>3);
		/*시프트 연산자: 비트로 바꿔서 연ㅅㄴ 수행
		 1) >>: 오른쪽으로 비트수 만큼 이동. 앞에 남은 빈칸은 부호비트
		 2) <<: 왼쪽으로 비트수 만큼 이동. 뒤에 남은 빈칸 0
		 3)>>>: 오른쪽으로 비트수 만큼 이동. 앞에 남은 빈칸 0으로 채움
		 */
		
		//-43: 11111111 11111111 11111111 11010101
		System.out.println(-43<<2);//-172
		//111111 11111111 11111111 11010101 00
		System.out.println(-43>>2);//-11
		//11 11111111 11111111 11111111 110101
		System.out.println(-43>>>2);//1073741813
		///00 11111111 11111111 11111111 110101
		
		System.out.println("3. 비교연산자: == != > >= < <= instanceof");
		//참조변수 instanceof 클래스명: 참조변수가 클래스의 객체인가?
		int m=150;
		int n=60;
		
		System.out.println(m>n);
		
		if(m>=n) {
			System.out.println("@@@@");
		}else if(m<n) {
			System.out.println("###");
		}
		

	}

}
