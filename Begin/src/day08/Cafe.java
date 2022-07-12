package day08;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine(); 
		// 밀크커피 만들기
		String s = cm.makeTea(3, 1, 6);
		System.out.println(s);

		//설탕커피
		cm.makeTea(2,1);
		System.out.println();
		
		//블랙커피
		cm.makeTea(4);
		System.out.println();
		
		//크림커피
		cm.makeTea(1,(short)3);
		System.out.println();
		
		//유자차
		Yuja x = new Yuja();
		x.setYuja(3);
		x.setSugar(5);
		cm.makeTea(x);
		System.out.println();

	}

}
