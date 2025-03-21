package day08_2025_02_25;

import java.util.Scanner;

public class 일정관리하기_함수2 {
	
	static Scanner sc = new Scanner(System.in);
	static String[] schedule = new String[5];
	static int index=0;

	public static void main(String[] args) {
		
	loop:	while(true) {
			
			System.out.println("메뉴 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				등록하기();
				break;
			case 2:
				조회하기();
				break;
			case 3:
				변경하기();
				break;
			case 4: 
				삭제하기();
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못된 메뉴");
			}
		}	//while
		System.out.println("bye");
	}	//main
	
	
	//
	public static void 등록하기() {
		
		System.out.println("등록할 일정 입력하세요");
		String temp = sc.next();
		schedule[index]=temp;
		index++;
	}
	
	public static void 조회하기() {
		
		for( int i=0; i<index; i++) {
			System.out.println((i+1) + schedule[i]);
		}
	}
	
	public static void 삭제하기() {
		
		조회하기();
		
		System.out.println("삭제할 일정을 선택하시오");
		int deleteindex = sc.nextInt();
		deleteindex= deleteindex-1;	//index--
		
		
		//0
		//
		for( int i=deleteindex; i<schedule.length-1; i++) {
			schedule[i] = schedule[i+1];
		}
		index--;
		
		
	}
	
	public static void 변경하기() {
		
		조회하기();
		System.out.println("변경 일정을 선택하시오");
		int index = sc.nextInt();
		index = index-1;	//1 -> 0 인덱스 변경
		
		System.out.println("변경할 일정 입력하시오");
		String temp = sc.next();
		
		schedule[index]=temp;
		
	}

}
