package day07_2025_02_24실습;

import java.util.Scanner;

public class 문제5_김유민 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하시오");
		int age = sc.nextInt();
		
		어른판단함수(age);
		
		
		
		
		

	}
	
	public static void 어른판단함수(int a) {
		
		if(a>19) {
			System.out.println("성인입니다");
		}else {
			System.out.println("미성년자입니다");
		}
	}

}
