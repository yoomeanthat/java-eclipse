package day04_2025_02_19;

public class 순한맛2번_1 {

	public static void main(String[] args) {
		
		
		//n=>	 1	   2		3
		//sum=>  1 + (1+2) + (1+2+3)
		//result 1	   4        10
		
		
		int n=0;
		int sum=0;
		int result=0;
		
		while(n<=100) {
			sum+=n;
			result+=sum;
			n++;
		}
		
		System.out.println(result);
	}

}
