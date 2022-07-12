package day08;

public class CoffeeMachine {
	int coffee, sugar, cream;
	Yuja yj;
	
	/*메소드 오버로딩(다중정의)
	 * 메소드 이름은 동일. 매개변수 자료형이 다르거나, 개수 다르거나, 순서 다르거나
	 * 반환타입 같아도 되고 달라도 된다
	 *생성자 오버로딩 this()=>생성자에서만 호출가능. 첫번째 문장
	 *메소드 오버로딩 this.메소드()
	 */
	
	//밀크, 블랙, 크림, 설탕 크림 만들다...->메소드
	public void makeTea(int coffee) {
		this.coffee = coffee;
		System.out.println("블랙커피 나간다. 농도: "+this.coffee);		
	}
	public void makeTea(int coffee, int sugar) {
		this.coffee = coffee;
		this.sugar=sugar;
		int n=this.coffee + this.sugar;
		System.out.println("설탕커피 나간다. 농도: "+n);
	}
	public String makeTea(int coffee, int sugar, int cream) {
		this.coffee = coffee;
		this.sugar=sugar;
		this.cream=cream;
		String s = "밀크커피 나간다. 농도: "+ (this.coffee + this.sugar+this.cream);
		return s;
	}
	public void makeTea(int coffee, short cream) {
		this.coffee = coffee;
		this.cream=cream;
		System.out.println("크림커피 나간다. 농도: "+(this.coffee + this.cream));
	}
	public int makeTea(short cream, int coffee) {
		this.makeTea(coffee, cream); //this.메소드() : 자기자신의 메소드를 호출할 때 사용
		return (this.coffee+this.cream);
	}
	//유자차 만드는 메소드
	public void makeTea(Yuja y) {
		this.yj=y;
		System.out.println("[신메뉴]유자차 나간다.");
		System.out.println("유자: "+yj.getYuja());
		System.out.println("설탕: "+yj.getSugar());
	}
	
}//////////////////////////
