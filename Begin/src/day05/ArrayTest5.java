package day05;

public class ArrayTest5 {
	public static void main(String[] args) {
		
		/*[문제1] 2차원 배열에 아래와 같은 값이 저장되도록 하세요.
		 *        단, for루프를 이용해서 저장한 뒤, 저장된 값들을
		 *        출력해봅시다.
		 *        
		 *        1 0 0 0 0
		 *        0 1 0 0 0
		 *        0 0 1 0 0
		 *        0 0 0 1 */
		
         /*[문제2] 아래 선언한 변수들의 자료유형을 맞추세요
		 * 1) int i, j; ===> i,j 모두 정수형
		 * 2) int []i, j; ==>i:1차원 배열, j:1차원 배열
		 * 3) int i[][], j[]; ==> i: 2차원 배열, j: 1차원 배열
		 * 4) int []i, j[]; ==> i: 1차원 배열, j: 2차원 배열
		 * 5) int [][]i, j; ==> i,j 모두 2차원 배열
		 * 6) int i,j[][];  ==> i : 정수형, j: 2차원 배열
		 * */

		System.out.println("Q1.------------------------------");
		int [][]a;
		a=new int[5][5];
		
		a[0][0]=1;
		a[1][1]=1;
		a[2][2]=1;
		a[3][3]=1;
		a[4][4]=1;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length ; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}
