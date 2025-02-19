package day04_2025_02_19;

public class 순한맛2번_2 {

	public static void main(String[] args) {
		
		
		int f_num=0;	//첫번째항
		int sum=0;	//항
		int i=0;	//순번이면서 반복제어
		int f_sum=0;	//항의 누적
		
		
		while(i<100) {
			f_num = f_num + i; //
			
			sum = f_num + (i+1);
			
			System.out.println(sum + ",");
			
			f_sum = f_sum + sum; //f_sum+=sum;
			i++;
		}
		
		
		System.out.println(f_sum);

		
	}

}
