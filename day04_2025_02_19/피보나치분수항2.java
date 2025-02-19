package day04_2025_02_19;

public class 피보나치분수항2 {

	public static void main(String[] args) {
		
		
		
		double sum = 0;
		
		int sign = 1;//	1 -1 1 -1
		int factorial = 1; // 분모
		int index = 1;	//분자, 항의 순번, 반복을 제어하는 역할
		
		
		while(index <=10) {
			factorial = factorial * index;
			
			sum = sum + ((index/(double)factorial)*sign);
			
			sign = sign *-1;	//-sign
			index = index +1;
		}
		
		System.out.println(sum);
		System.out.printf("%.2f" , sum);

	}

}
