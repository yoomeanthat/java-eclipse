package day04_2025_02_19;

public class 피보나치수열 {

	public static void main(String[] args) {
		
		
		
		//3개 피보나치 수열
		
		long c;
		long a=0;
		long b=1;
		
		int i=0;
		
		
		while(i<=49) {
			c=0;
			c=a+b;	//항을 구한다
			
			
			a=b;	//
			b=c;	//
			
			i=i+1;
			
			System.out.print(a+",");;
		}

	}

}
