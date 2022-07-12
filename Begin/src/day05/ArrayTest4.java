package day05;

public class ArrayTest4 {

	public static void main(String[] args) {
		//2차원 배열
		//1. 선언 2. 메모리할당 3. 초기화
		//int [][] a;
		//int a[][];
		int [] a [];//2차원 배열 선언

		//2. 메모리할당 => 3행2열
		a= new int[3][2];
		
		//3. 초기화
		a[0][0]=10;
		a[0][1]=10;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		System.out.println("a[1][1]="+a[1][1]);
		//for 루프 중첩해서 배열 a 저장된 값을 출력하시오
		for (int i=0; i<a.length;i++) {
			for (int k=0; k<a[i].length;k++) {
				System.out.print(a[i][k]+" ");
			} 
			System.out.println();
		}
		System.out.println("a.length:"+a.length);
		System.out.println("a[0].length:"+a[0].length);
		System.out.println("a[1].length:"+a[1].length);
		System.out.println("a[2].length:"+a[2].length);
		//배열 a에 저장된 값을 출력하되 확장 for루프문을 이용해 출력하세요
	
		for(int aa[] : a)
		{
			for(int aaa : aa)
				System.out.print(aaa+" ");
			System.out.println();
		}
		
		/* 2차원 배열 a가 참조하는 것은 행
		 * a------>행 |a[0] | a[1] | a[2] |
		 *              |
		 *           열 
		 *           |a[0][0]|a[0][1]|
		 */
		System.out.println("2.--------------");
		//행의 크기만 먼저 잡아두고, 열의 크기를 나중에 가변적으로 할당.
		char[][]ch=new char[3][];
		ch[0]=new char[2];
		ch[1]=new char[3];
		ch[2]=new char[4];
		


	}

}
