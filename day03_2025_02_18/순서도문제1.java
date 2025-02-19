package day03_2025_02_18;

public class 순서도문제1 {

	public static void main(String[] args) {
		
		int MAX =100;
		int i;
		int sum=0;
		int total=0;
		
		for(i=1;i<=MAX;i++) {
			sum = sum + i;
			System.out.println(i+"번째 항:"+sum);
			total = total +sum;
		}
		System.out.println("총합은:"+total);
	}

}
