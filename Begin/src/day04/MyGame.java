package day04;
import java.util.*;

public class MyGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int comp=(int)(Math.random()*100 + 1); //1<= com <101  사이의 임의의 정수값을 랜덤하게 발생시킨다
		int count=0;//시도 횟수를 세기위한 변수
		while(true) {
			System.out.println("1 ~100사이의 정수를 입력하세요");
			int input=sc.nextInt();//정수를 하나 입력받기
			if(input<1|| input >100) {
				continue;
			}
			count++;
			if(count>7) {
				System.out.println("시도 횟수(7번) 초과: 다음기회에~~");
				//break;
				return;
			}
			
			if(comp==input) {
				System.out.println("맞췄습니다!!");
				break;
			}else if(comp>input) {
				System.out.println("더 큰 수를 입력하세요!");
			}else {
				System.out.println("더 작은 수를 입력하세요!");
			}
			
		}
		System.out.println("게임 시도횟수: "+count);
		//출력할 결과: "맞췄습니다", 시도한 회수: 6번입니다
		//시도횟수가 7번을 넘어서면 "못맞췄군요! 다음 기회에" 출력후 프로그램 종료시키기

	}

}
