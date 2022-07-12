package day02;

public class PrimitiveType {
	
	public static void main(String[] args) {
		System.out.println("기본자료형----------");
		System.out.println("");//Ctrl+D: 현재 커서행을 삭제
		//Ctrl+F11: 현재 파일 실행시킴(java)
		//Ctrl+S: 저장=> 자동으로 컴파일됨(javac)
		int a=10;
		int b = 010; //정수(8진수): 8진수는 앞에 0을 접두어로 쓴다
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c = 0123;
		System.out.println("c="+c);
		int d = 0x12; //16진수:0~9,ABCDEF
		System.out.println("d="+d);
		int e = 0x2ac;
		System.out.println("e="+e);
		
		char c1 = 'a';
		System.out.println("c1="+c1);
		char c2 = '0';
		System.out.println("c2="+c2);
		//int 미만의 자료형(byte, short, char)=>연산에 사용되면 int로 자동 형변환
		char c3 = (char)(c2+1);
		System.out.println(c3);
		
		double d2=.456E+2;
		System.out.println(d2);
	}

}
