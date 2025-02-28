package day11_일정관리실습;

import java.util.Scanner;

public class 일정관리출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		일정관리 [] schedule = new 일정관리[5];
		schedule[0] = new 일정관리("월요일", "수학공부", "3월3일");
		schedule[1] = new 일정관리("화요일", "영어공부", "3월4일");
		schedule[2] = new 일정관리("수요일", "국어공부", "3월5일");
		schedule[3] = new 일정관리("목요일", "과학공부", "3월6일");
		schedule[4] = new 일정관리("금요일", "역사공부", "3월7일");
		
	
	loop: while(true) {
		System.out.println("일정관리 프로그램입니다. 일정을 등록해주세요");
		System.out.println("메뉴를 고르시오 1.조회, 2.등록, 3.삭제, 4.변경, 5종료");
		int menu = sc.nextInt();
		
		switch(menu) {
			
			case 1:
				
				for( int i=0; i<schedule.length; i++) {
					System.out.println(schedule[i]);
				}
				
			
				
				
				
				
		}
		
	}
		
		

	}

}
