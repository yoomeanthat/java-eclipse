package day04_2025_02_19;

public class 피보나치수열_저장소 {

	public static void main(String[] args) {
		
		
		
		// 1 1 2 3 5 8 13 21
		
		long num1=0;
		long num2=1;
		int cnt=1;
		
		while(cnt <=50) {
			
			System.out.println(num2);
			num1= num1+num2;
			
			System.out.println(num1);
			
			num2 = num2+num1;
			cnt = cnt+2;
			
		}

	}

}
