package multicampus;
import java.util.*;
/**학사관리 프로그램에서 사용하는 학생 클래스*/
public class Student {
	int no;
	String name;
	String major;
	String phone;
	/** 학생정보를 출력하는 메소드 */
	public void showInfo() {
		System.out.println("학 번: "+no);
		System.out.println("이 름: "+name);
		System.out.println("전 공: "+major);
		System.out.println("연락처: "+phone);
	}
	/**학생정보를 입력받는 메소드*/
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("학번 입력=>");
		no=sc.nextInt();
		System.out.println("이름 입력=>");
		name=sc.next();
		System.out.println("전공 입력=>");
		major=sc.next();
		System.out.println("연락처 입력=>");
		phone=sc.next();
	}
}////////////////////////////////
