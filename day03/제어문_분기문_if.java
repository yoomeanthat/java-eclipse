package day03;

import java.util.Scanner;

public class 제어문_분기문_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor=50;
		
		//A,B,C,F
		
		kor = sc.nextInt();
		
		if(kor>=90) {
			System.out.println("A");
		}else if(kor>=80) {		//else if (kor>=80 && kor <=89)
			System.out.println("B");
		}else if(kor>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}

	}

}
