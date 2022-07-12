package day03;

public class forTest {

	public static void main(String[] args) {
		System.out.println("구구단");
		int dan=7;
		for (int i=1; i<10;i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
		//[문제2]1~10까지 합을 구하시오 
		int sum=0;
		int gop = 1;
		for (int a=1; a<11;a++) {
			sum=sum+a;
			gop=gop*a;
		}
		System.out.println("1~10까지 합: "+sum);
		System.out.println("1~10까지 곱: "+gop);
		
		//[문제4]1~100까지 수 중 짝수들의 합을 구하시오

	}

}
