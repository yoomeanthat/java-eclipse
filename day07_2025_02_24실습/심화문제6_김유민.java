package day07_2025_02_24실습;

import java.util.Scanner;

public class 심화문제6_김유민 {

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
		
		System.out.println(judge(nums));
		
	}
	
	public static int judge(int[] num) {
		
		int max = num[0];
		for(int i=1;i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
			}
		}
		return max;
	}

}
