package day05;

public class ExceptionTest {

	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++) {
			try {
				int a=50/(i-3);
				System.out.println("a="+a);
			}catch(ArithmeticException e) {
				System.out.println("분모가 0이 되면 안돼!");
			}
		}//for

		System.out.println("#매우중요한코드#");
	}

}
