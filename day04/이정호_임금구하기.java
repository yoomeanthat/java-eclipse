package day04;

import java.util.Scanner;

public class 이정호_임금구하기 {

	public static void main(String[] args) {
		 
		
		String name;
		int code;
		int time;
		int money=0;
		
		Scanner sc = new Scanner( System.in);
		
		name = sc.next();
		code = sc.nextInt();
		time = sc.nextInt();
		
		
		switch( code) {
		case 1:
			money  = time*2000;
			break;
		case 2:
			money = time*2500;
			break;
		case 3:
			money = time *3000;
			break;
		case 4:
			money = time *4000;
			break;
		default:
			System.out.println("해당내역 없음 ");
			//return;
		}
		
		System.out.println( name);
		System.out.println( money);

	}

}
