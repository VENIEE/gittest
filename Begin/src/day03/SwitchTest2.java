package day03;
import java.util.*;
/*
 * 월(month)을 입력해서 해당 월의 일수(days)를 출력하는 프로그램을 작성하세요
 * 1, 3,5,7,8,10,12  : 31일
 * 2  : 28일
 * 4,6,9,11 : 30일
 * 
 * switch~case구문을 이용해서 구현하세요
 * */

public class SwitchTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력하시오=>");
		int month=sc.nextInt();
		int days=0;
		
		switch(month) {
		case 1,3,5,7,8,10,12:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 4,6,9,11:
			days = 30;
			break;
		default:
			System.out.println("없는 달 입니다");
			return;
		}
		System.out.println(month+"월은 "+days+"일까지 있습니다");

	}

}
