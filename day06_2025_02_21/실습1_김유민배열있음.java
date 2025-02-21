package day06_2025_02_21;

import java.util.Scanner;

public class 실습1_김유민배열있음 {

	public static void main(String[] args) {
		
		int money []= {50000,10000,5000,1000,500,100,50,10}; 
		Scanner sc = new Scanner( System.in);
		
		System.out.println("사원명을 입력하시오:");
		String employeeName = sc.nextLine();
		
		
		System.out.println("출장비를 입력하시오:");
		int expense =  sc.nextInt();
		
		
		System.out.println(employeeName + "님의 화폐매수는: ");
        for (int i=0;i<money.length;i++) {
            int count = expense / money[i];
            expense %= money[i];
            System.out.println(money[i] + "원: " + count);
        }
		
	}

}
