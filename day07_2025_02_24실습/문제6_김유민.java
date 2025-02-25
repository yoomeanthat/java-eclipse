package day07_2025_02_24실습;

import java.util.Scanner;

public class 문제6_김유민 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	loop:	while(true) {
			System.out.println("1.운동, 2.공부, 3.입시 4.나가기");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				운동응원();
				break;
			case 2:
				공부응원();
				break;
			case 3:
				입시응원();
				break;
			case 4:
				System.out.println("응원그만하기");
				break loop;
			default:
				System.out.println("잘못된 입력입니다");
			}
		}System.out.println("bye");
		
		

	}
	
	
	public static void 운동응원() {
		System.out.println("오늘도 득급합시다!");
	}
	public static void 공부응원() {
		System.out.println("오늘도 열심히해서 지식을 쌓아요!");
	}
	public static void 입시응원() {
		System.out.println("좋은 대학에 가기 위해서 열공합시다!");
	}

}
