package day06;
import java.io.*;

public class ExceptionTest2 {
	//[1] Handle하는 방법
	public static void input() 
	{
		//IOException : 컴파일 타임 예외
		try {
			//int n=System.in.read();
			char n=(char)System.in.read();
			System.out.println("n: "+n);
		}catch(IOException e) {
			System.out.println("입출력 에러 발생: "+e);
		}
	}//---------------------------
	//[2] Declare하는 방법: throws 절을 이용
	//==> sub()메소드를 호출한 쪽으로 예외처리를 넘긴다
	public static void sub() throws IOException
	{
		int n=System.in.read();
		System.out.println("n: "+n);		
	}

	public static void main(String[] args) 
	throws IOException
	{
		//input()메소드 호출해보기
		System.out.println("입력하세요=>");
		//ExceptionTest2.input();
		//sub()메소드 호출해보기
		ExceptionTest2.sub();
		
	}

}
