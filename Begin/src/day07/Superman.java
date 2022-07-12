package day07;

public class Superman {
	String name;
	int height;
	int power;//초능력
	
	//기본생성자 
	public Superman() {
		this("슈퍼맨",166, 100);
	}
	
	//인자생성자 3개 만드세요(int),(int,int),(String,int, int),(int String int)
	public Superman(String name) {
		this(name,170,200);
		
	}
	public Superman(String name, int height) {
		this(name, height,300);
		
	}
	//target : 여기서 초기화를 하자
	public Superman(String name, int height, int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	public String getInfo() {
		
		String info="이름: "+name+"\n키: "+height+"\n초능력: "+power;
		return info;
	}
	

}//////////////////////////////////
