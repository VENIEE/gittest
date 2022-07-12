package day03;

import java.util.Scanner;

public class ifTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~9, 알파벳, 기타 문자를 1자만 입력=>");
		String input = sc.next();
		System.out.println("input: "+input);
		//String클래스가 가진 메소드:
		/*
		 *char charAt(int index): 문자열 특정 index 위치의 문자를 추출하여 반환
		 */ 
		char ch=input.charAt(0);//첫문장 추출
		System.out.println("ch: "+ch);
		/*ch값 0~9 값이면 '숫자'
		 * 알파벳 대문자 또는 소문자 '알파벳이군요'
		 * 그 외 문자는'기타문자'
		 */
		//ctrl+shift+/: 주석
		/*
		 * if(ch >= 48 && ch <= 57) {//아스키코드 System.out.println("숫자입니다"); } else if((ch
		 * >= 65 && ch <= 90)||ch >= 97 && ch <= 122)) { System.out.println("알파벳이군요"); }
		 * else { System.out.println("기타 문자입니다"); }
		 */
		if(ch >= '0' && ch <= '9'){
			System.out.println("숫자입니다");
		}else if((ch>= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')){
			System.out.println("알파벳이군요");
		}else {
			System.out.println("기타 문자입니다"); }
		}

}
