package day04_2025_02_19;

public class 초과항구하기2 {

	public static void main(String[] args) {
		
		int n=1;	//순번
		int i=1;	//항
		int sum=1;	//항의 누적
		
		while(sum <=1000) {
			n++;
			i=i+2;
			sum = sum+i;
			
			System.out.println( i+"==>" + sum);
		}
		
		
		System.out.println( i+"==>" + sum);
	}

}
