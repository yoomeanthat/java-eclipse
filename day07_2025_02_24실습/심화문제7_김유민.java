package day07_2025_02_24실습;

import java.util.Scanner;

public class 심화문제7_김유민 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int [] nums = new int[] {
			sc.nextInt(),
			sc.nextInt(),
			sc.nextInt(),
			sc.nextInt(),
			sc.nextInt(),
			sc.nextInt()
			
		};
		
		System.out.println(avg(nums));
		
	}
	
	public static int avg(int[] num) {
		int total = 0;
		for(int i=0; i<num.length; i++) {
			total=  total +num[i];
		}
		return total/num.length;
		
		
	}

}
