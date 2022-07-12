package day05;

public class Test1 {

	public static void main(String[] args) {
		int[]arr[]=new int[5][5];
		int cnt = 0; 
		/* 1씩 증가하면서 arr에 저장하되 
		1   2  3  4 5
		16 17 18 19 6
		15 24 25 20 7
		14 23 22 21 8
		13 12 11 10 9
		*/
		arr[0][0]=1;
		arr[1][1]=1;
		arr[2][2]=1;
		arr[3][3]=1;
		arr[4][4]=1;		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length ; j++) {
				arr[i][j] =cnt;
				cnt++;
				System.out.print(" "+cnt+" ");
			}
			System.out.println();
		}

	}

}
