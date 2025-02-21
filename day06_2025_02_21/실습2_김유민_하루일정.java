package day06_2025_02_21;

import java.util.Scanner;

public class 실습2_김유민_하루일정 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String day[] = new String[5];
		int index=0;
		
		System.out.println("오늘 일정을 5개 적어주세요");
		
		String schedule = sc.next();
		day[index] = schedule;
		index++;
		
		schedule = sc.next();
		day[index] = schedule;
		index++;
		
		schedule = sc.next();
		day[index] = schedule;
		index++;
		
		schedule = sc.next();
		day[index] = schedule;
		index++;
		
		schedule = sc.next();
		day[index] = schedule;
		index++;
		
		System.out.print("오늘 일정은 ");
		for(int i=0; i<index;i++) {
			System.out.print(day[i]+" ");
			
		}
		System.out.print("입니다!");
		
		

	}

}
