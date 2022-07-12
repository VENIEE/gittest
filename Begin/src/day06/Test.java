package day06;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int [] coinUnit= {500,100,50,10};
		
		System.out.println("가지고 있는 돈을 입력하세요=>");
		int money =sc.nextInt();
		System.out.println(money+"원");
		System.out.println("--------------");
		for(int i=0;i<coinUnit.length;i++) {
			int su=money/coinUnit[i];
			System.out.println(coinUnit[i]+"원: "+su);
			money=money%coinUnit[i];
		}
		

	}

}
