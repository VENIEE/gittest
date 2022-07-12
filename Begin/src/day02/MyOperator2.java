package day02;

public class MyOperator2 {

	public static void main(String[] args) {
		System.out.println("4. 비트연산자: &(and) |(or) ^(xor)");
		//정수에만 사용되는 연산자
		
		int x=3;
		int y=5;
		System.out.println("x&y="+(x&y));
		System.out.println("x|y="+(x|y));
		System.out.println("x^y="+(x^y));
		
		System.out.println("5. 논리 연산자: & && | ||");
		int a=5;
		int b=6;
		if ((a>b)&&(a>0)) {
			System.out.println("Hello");		
		}else if((b>a)||(b<0)) {
			System.out.println("Hi");		
		}
		
		/*
		 1) &,|: 연산자를 사용하면 앞의 연산으로 결과를 알 수 있어도 뒤의 문장까지 비교
		 2) &&, ||: 앞의 연산으로 결과 알 수 있으면 뒤의 문장은 수행 안한다.
		 */
		
		//[문제1] 아래 출력문 결과 예측
		int i=1;
		int j=i++;//j=1,i=2
		if((i>++j) && (i++ ==j)){//둘다 false &:i=3
			i=i+j;//수행 안함
		}
		System.out.println("i="+i);//&:i=3, &&:i=2
		
		//[문제2] 아래 출력문 결과 예측
		int k=0;
		int p=1;
		if((k++ ==0) || (p++ ==2)){//(k++==0)이 True
			k=42;
		}
		System.out.println("k="+k+",p="+p);//|:p=2,||:p=1
				
		//[문제3] 아래 출력문 결과 예측
		boolean r=false;
		boolean e=false;
		boolean w=((r=true)||(e=true));//=는 대입연산자, ==:등호연산자
		System.out.println(r+", "+e+", "+w);//|:ttt, ||:tft

	}

}
