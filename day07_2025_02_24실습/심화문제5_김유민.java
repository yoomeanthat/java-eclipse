package day07_2025_02_24실습;

import java.util.Scanner;

public class 심화문제5_김유민 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int input = sc.nextInt();
		약수(input);

	}
	
	
	public static void 약수(int num) {
		
		int index=0;
		int [] divisor = new int [num];
		
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				divisor[index]=i;
				index++;
			}
		}
		System.out.print(num + "의 약수는: ");
		for(int i=0;i<index;i++) {
			System.out.print(divisor[i]+" ");
		}
	}
}	
