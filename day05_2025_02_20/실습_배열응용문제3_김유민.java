package day05_2025_02_20;

import java.util.Scanner;

public class 실습_배열응용문제3_김유민 {

	public static void main(String[] args) {
		
	       	Scanner sc = new Scanner(System.in);

	        // 숫자 입력 받기
	        System.out.println("수를 입력하세요: ");
	        int number = sc.nextInt();
	        
	        System.out.println(number + "의 약수는:");

	        // 약수 구하기
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                System.out.println(i + " "); // 약수 출력
	            }
	        }
	        
	        
	        
	        
	}

}


