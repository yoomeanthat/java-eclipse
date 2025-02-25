package day07_2025_02_24실습;

import java.util.Scanner;

public class 문제3_김유민 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("투자금을 입력하시오: ");
		
		int num = sc.nextInt();
		
		int result = multi(num);
		
		System.out.println("반환값은 " +result+"원 입니다");
		
		

	}
	
	public static int multi(int a) {
		
		int result = a*2;
		return result;
	}

}
