package day08;

/*하나의 자바파일에 여러 클래스를 구성할 경우
 * public인 클래스는 1개만 존재해야 하며,
 * 파일명으로 된 클래스에 public을 붙인다*/

class Person{
	int no;
	String name;
	//public Person() {}	
	//생성자를 하나라도 구성하는 순간, 컴파일러가 제공하던 기본 생성자는 사라진다.
	public Person(int n, String m) {
		no = n;
		name = m;
	}
}//.............................
//자식 클래스의 생성자에서는 묵시적으로 super() 호출
//super() : 부모클래스의 기본생성자를 호출할 때 사용하는 키워드
class Student extends Person{
	String major;
	public Student() {
		//super() 묵시적으로 호출 ==> 기본생성자가 없어서 에러가 난다.
		super(100,"김학생");//명시적으로 super(매개변수)를 호출하여 해결한다
	}
}//............................

class Teacher extends Person{
	String subject;
	public Teacher() {
		//super(100,"최선생");
		this(200,"최선생","C");
		/*[1] super()는 생성사에서만 호출 가능
		 * [2] 생성자의 첫번째 문장이어야 한다
		 * [3] this()와는 함께 사용할 수 없다. 
		 */
	}
	public Teacher(int no, String name, String subject) {
		super(no, name);
		this.subject = subject;
	}
}//.............................

public class Inheritance2 {

	public static void main(String[] args) {
		
		Person p1 = new Person(1, "홍설");
		//p1.name = "홍설";
		//p1.no = 1;
	}
}//----------------------------
