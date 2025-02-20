package day05_2025_02_20;

import java.util.Scanner;

public class 짝수배열문제1 {

	public static void main(String[] args) {
		
		
		
		//1)숫자를 입력 받아서 10개  (배열에 저장한 후 )    =>   배열의 내용을  10개를 출력하기 
		//2)숫자를 입력 받아서 0이  아니면 배열에 저장한 후   =>   입력된 갯수만큼 출력하기  
				

		//3)
		// 1차배열 (정수형배열  10개) , 숫자 10개를 저장할 수 있는 배열 준비하기  
		// 수를 입력받아서 짝수저장하기
		// 수가 0이면 입력되면 종료 
		// 배열의 저장된 짝수 출력하기
		
		
		
		
		
		 // 1차 배열 (정수형 배열 10개) 준비
        int[] numbers = new int[10]; 
        
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 10개의 숫자 입력 받기
        System.out.println("10개의 숫자를 입력하세요:");

        // 숫자 입력 받기
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt(); // 배열에 숫자 저장
        }

        // 배열의 내용 출력하기
        System.out.println("입력된 숫자들은:");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // 배열의 각 요소 출력
        }
		
		
		

	}

}
