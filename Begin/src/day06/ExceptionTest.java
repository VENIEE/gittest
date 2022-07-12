package day06;
/*
 * try{
 * }catch(){
 * 
 * }finally{
 * 	 finally 블럭은 반드시 한 번은 수행되는 블럭이다.
 *   위에 return문이 오더라도 한번은 수행하고 제어권을 넘긴다.
 *   단 예외가 있다. 시스템 종료 코드가 있을 경우는 finally블럭이 실행되지 않음
 * }
 * 
 * */
public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			int num=Integer.parseInt(args[0]);		
			System.out.println(50/num);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 1개 입력해야 해요");
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해야 해요");
			return;
		}catch(ArithmeticException e) {
			System.out.println("분모가 0이 되어서는 안됩니다");
			System.exit(-1);//시스템 종료
		}catch(Exception e) {
			System.out.println("기타 오류 발생: "+e.getMessage());
			//String getMessage(): 예외 메시지를 문자열로 반환한다
		}finally {
			System.out.println("##반드시 실행되어야 할 코드입니다##");
		}
		System.out.println("The End~~~~");

	}

}
