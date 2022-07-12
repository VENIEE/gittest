package day05;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int []b= {90, 80, 70};
		int []a= {100};
		
		for(int k=0;k<b.length;k++) {
			System.out.println("b["+k+"]="+b[k]);
		}
		
		b[0] =100;
		System.out.println("b[0]="+b[0]);
		System.out.println("a[0]="+a[0]);
		
		System.out.println("2.----------");
		int []x= {1,2,3,4};
		int []y= {10,20};
		int tmp[]; //선언
		//x,y값을 서로 바꿔보세요 tmp변수 활용해서(swap)
		//for루프 이용해 x,y에 저장된 값 출력하시오
		tmp = x;
		x = y;
		y = tmp;
		for(int i=0; i<x.length; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
		for(int i=0; i<y.length; i++) {
			System.out.println("y["+i+"] = "+y[i]);
		}
		System.out.println("3.----------");
		//참조형의 배열-String, Date, Scanner, Object...
		String[] arr=null; //1. 선언
		System.out.println(arr);
		
		arr=new String[4]; //2. 메모리할당
		System.out.println("arr[0]= "+arr[0]);
		
		//3. 초기화

		arr[0]="Hello";
		arr[1]=new String("Hi");
		arr[2]=3+"5";
		arr[3]="";
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("**********");
		//확장 for 루프, 게선된 for루프, for each루프...
		/*for(변수 선언문: 자료구조)
		 * {
		 * 실행문;
		 * }
		 * 알아서 자료구조의 크기(length)만큼 반복문 돌면서
		 * 자료구조에 저장된 값을 변수에 할당한다
		 */
		System.out.println("**********");
		for(String s: arr) {
			System.out.println(s.toUpperCase());//반대는 toLowerCase()
			System.out.println("s:"+s);
		}
		
		String str[]= {"안녕하세요", "반갑습니다","잘가세요"};
		//확장 for루프로 str에 저장된 값 출력하세요
		for(String s:str)
			System.out.println(s);
	} 

}
