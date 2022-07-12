package day08;
//자식 클래스: sub class, derived class
public class Sub extends Super{
	int b= 30;
	int c = 40;
	
	@Override //annotation
	public void func() {
		System.out.println("func()####");
	}
	
	//Overload
	public String func(int a) {
		return "func(): a="+a;
	}

}
