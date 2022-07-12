package day07;

public class Aquaman {
	String name;
	int height;
	double speed;
	/*생성자를 구성하지 않으면 컴파일러는 기본적으로 디폴트 생성자를 제공해준다.
	 * 한 개라도 생성자를 구성하게되면, 제공되던 디폴트 생성자는 사라진다.
	 * => 가능하면 기본생성자를 구성한 뒤에 다른 생성자를 구성하는 습관을 들이자.
	 * */
	//this()이용해서 초기화하세요
	//매개변수 3개 받는 생성자 구성해보기
	public Aquaman() {
		this("수중인간", 155, 56.78);
	}
	
	public Aquaman(String n, int h, double s) {
		name=n;
		height=h;
		speed=s;
	}
	
	
	public String getInfo() {
		String info="이름: "+name+"\n키: "+height+"\n스피드: "+speed;
		return info;
	}

}/////////////////////////////////////////
