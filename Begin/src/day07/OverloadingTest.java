package day07;

public class OverloadingTest {

	public static void main(String[] args) {
		//슈퍼맨 객체 2개 생성한 뒤 getInfo()호출해서 정보 출력하기
		
		//아쿠아맨 객체 1개 생성한 뒤 getInfo()호출해서 정보 출력하기
		//슈퍼맨 객체 2개 생성한 뒤 getInfo()호출해서 정보 출력하기
		Superman s1=new Superman(); //기본 생성자 호출
		
		System.out.println("슈퍼맨 이름: "+s1.name);
		System.out.println("슈퍼맨 키: "+s1.height);
		System.out.println("슈퍼맨 파워: "+s1.power);
		
		Superman s2 = new Superman();
		System.out.println(s2.getInfo());
		
		Superman s3=new Superman("강철");
		String str=s3.getInfo();
		System.out.println(str);
		
		Superman s4=new Superman("김슈퍼",188,500);
		System.out.println(s4.getInfo());
		//다향한 형태로 객체 생성할 수 있다.
		
		Aquaman a1=new Aquaman();
		System.out.println(a1.getInfo());
		/* 슈퍼맨 객체4개를 배열에 저장하세요.
		 * 그런뒤 for루프 이용해서 슈퍼맨들의 정보를 출력하세요
		 * */
		Superman arr[] = {s1,s2,s3,s4};
		for(int i=0; i<arr.length; i++) {
			System.out.println("*************");
			System.out.println(arr[i].getInfo());
		}



	}

}
