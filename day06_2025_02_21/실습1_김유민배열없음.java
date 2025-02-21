package day06_2025_02_21;

import java.util.Scanner;

public class 실습1_김유민배열없음 {

	public static void main(String[] args) {
		
		int money []= {50000,10000,5000,1000,500,100,50,10}; 
		Scanner sc = new Scanner( System.in);
		
		System.out.println("사원명을 입력하시오:");
		String employeeName = sc.nextLine();
		
		
		System.out.println("출장비를 입력하시오:");
		int expense =  sc.nextInt();
		
		
		System.out.println(employeeName + "님의 화폐매수는: ");
		
		/*
        for (int bill : money) {
            int count = expense / bill;
            expense %= bill;
            System.out.println(bill + "원: " + count);
        }
		*/
		
		// 50000원
        int count = expense / 50000;
        expense %= 50000;
        System.out.println("오만원: " + count);
        
        // 10000원
        count = expense / 10000;
        expense %= 10000;
        System.out.println("만원: " + count);
        
        // 5000원
        count = expense / 5000;
        expense %= 5000;
        System.out.println("오천원: " + count);
        
        // 1000원
        count = expense / 1000;
        expense %= 1000;
        System.out.println("천원: " + count);
        
        // 500원
        count = expense / 500;
        expense %= 500;
        System.out.println("오백원: " + count);
        
        // 100원
        count = expense / 100;
        expense %= 100;
        System.out.println("백원: " + count);
        
        // 50원
        count = expense / 50;
        expense %= 50;
        System.out.println("오십원: " + count);
        
        // 10원
        count = expense / 10;
        expense %= 10;
        System.out.println("십원: " + count);
        
	}

}
