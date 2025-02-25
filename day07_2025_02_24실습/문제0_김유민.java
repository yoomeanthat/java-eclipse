package day07_2025_02_24실습;

import java.util.Scanner;

public class 문제0_김유민 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하시오: ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 수를 입력하시오: ");
		int num2 = sc.nextInt();
		
		int result = 합구하기(num1, num2);
		
		System.out.println("두 수의 합: " + result);
		

	}
	
	public static int 합구하기(int su1, int su2) {
		
		
		int result = su1 +su2;
		
		return result;
	}

}
