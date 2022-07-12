package day02;

public class UnaryOperator {
	
	public static void main(String[] args) {
		System.out.println("1. 단향 연산자(부호: +,-)");
		int a=8;
		System.out.println(+a);
		System.out.println(-a);
		System.out.println("2. 증감연산자: ++, --");
		int b =5;
		long c = 9;
		b++;//b=b+1
		c--;//c=c-1
		System.out.println(b);//6
		System.out.println(c);//8
		++b;
		--c;
		System.out.println(b);//7
		System.out.println(c);//7
		//++,--가 단독으로 사용될 때는 변수 앞에오나 뒤에오나 차이가 없다
		//다른 수식과 함께 사용되면 위치에 따라 차이가 생긴다
		float d = 5.3f;
		double e = 7.3;
		System.out.println(d++);//5.3
		System.out.println("d: "+d);//6.3
		System.out.println(e--);//7.3
		System.out.println("e:"+e);//6.3  
		System.out.println(++d);//7.3
		System.out.println("d: "+d);//7.3
		System.out.println(--e);//5.3
		System.out.println("e:"+e);//5.3
		
		int x = 10;
		int y = x++;
		System.out.println("x="+x);//11
		System.out.println("y="+y);//10
		
		x = 10;
		int z = ++x;
		System.out.println("x="+x);//11
		System.out.println("z="+z);//11
		
		System.out.println("3. 비트별 not연산자: ~"); // 0->1, 1->0
		
		int m=3;
		System.out.println(m);
		System.out.println(~m);
		
		//[문제 1]
		int n=0xfffffff1;
		//1111 1111 1111 1111 1111 1111 1111 0001
		//0000 0000 0000 0000 0000 0000 0000 1000
		System.out.println("n: "+n);//-15
		System.out.println("~n: "+(~n));//4
		System.out.println(~42);//-43
		
		System.out.println("4. 논리 부정 연산자: !");
		//boolean 사용. int 사용 안됨
		//t->f, f->t
		boolean bo = true;
		System.out.println(bo);
		System.out.println(!bo);
		System.out.println(!(3<2));
		
		int fo = 5;
		System.out.println(fo==5.0); //==등가연산자
	}

}
