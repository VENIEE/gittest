package day03;

public class SwitchTest {

	public static void main(String[] args) {
		char oper = '/';
		int a=3;
		int b=5;
		int result = 0;
		switch(oper) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("없는 연산자");
		}
		System.out.println("result: "+result);		
	}//main()-------------------------
}
