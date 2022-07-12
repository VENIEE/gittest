package day05;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		float a[] = {-16.456f, 200.5f, 30e3f};
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("----------------------");

		float [] f = new float[3];
		f[0] = -16.456f;
		f[1] = 200.5f;
		f[2] = 30e3f;
		float sum = 0f;
		for(int i = 0; i<f.length; i++) {
			System.out.println(f[i]);
			sum = sum+f[i];
		}System.out.println("총 합= "+sum);
		System.out.println("평균값= "+(sum/f.length));
		
	}

}
