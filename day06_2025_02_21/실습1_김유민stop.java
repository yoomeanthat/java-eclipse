package day06_2025_02_21;

import java.util.Scanner;

public class 실습1_김유민stop {

	public static void main(String[] args) {
		
		
		
		int money []= {50000,10000,5000,1000,500,100,50,10};
		Scanner sc = new Scanner( System.in);
		String[] names = new String[10];	
		int menu;
		
		
	loop:	while(true) {
			
			
			System.out.println("1. 출장비 출력하기 , 2. 종료하기");
			menu = sc.nextInt();
			
			
			//
			switch(menu){
					
				case 1:
					sc.nextLine();
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
			        
					
					break;
				case 2:
					System.out.println("종료하시겠습니까(stop 입력 시 종료)");
					String input = sc.next();
					if(input.equals("stop")) {
						break loop;
					}
					break;
					
			}
		}
		
		System.out.println("끝");

	}

}
