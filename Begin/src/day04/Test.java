package day04;

public class Test {

	public static void main(String[] args) {
		//1~20정수 중 2 or 3의 배수가 아닌 값의 총합
		int sum=0;
		for(int i=1;i<21;i++) {
			
			//if(!(i%2==0 || i%3==0))
			if(i%2!=0 && i%3!=0)
			{
				System.out.println("i: "+i);
				sum=sum+i;
			}			
		}
		System.out.println("sum: "+sum);
		
		//1 ~10까지의 합
		sum=0;
		int totalSum=0;
		for(int i=1;i<11;i++) {
			//sum=sum+i;
			sum+=i;//1, 1+2, 1+2+3, 1+2+3+4 .... 1+2+3+...+10
			totalSum+=sum;
		}
		System.out.println("sum: "+sum);
		System.out.println("totalSum: "+totalSum);
	}

}
