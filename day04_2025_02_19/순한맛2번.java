package day04_2025_02_19;

public class 순한맛2번 {

	public static void main(String[] args) {
		
		//	1		2		3		4
		//	1   +  (1+2) +(1+2+3)+(1+2+3+4)
		
		int n=1;	//순번
		int sum=0;	//항
		int hap=0;	//항의 누적
		
		while(n<=100) {
			
			sum = sum+n;
			hap = hap+sum;
			n=n+1;
			
			System.out.println(sum);
			System.out.println(hap);
		}
		
		System.out.println(hap);

	}

}
