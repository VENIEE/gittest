package day08;
//Aquaman is a Human
public class Aquaman extends Human{
	double speed;
	
	public Aquaman() {
		this("수중인간", 160, 789.12);
	}
	public Aquaman(String n, int h, double s) {
		this.name = n;
		this.height=h;
		this.speed=s;
	}
	
	public String getInfo() {//내용은 부모와 다르게 재정의
		return "이름: "+name+ "\n키: "+height+"\n스피드: "+speed;
	}
	//getInfo()를 오버로딩 해보기

}////////////////////////////
