package day14.인터페이스실습;

import java.util.Scanner;

public class 계산기프로그램 {
	
	
	
	Calculator calculator;
	
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("햄버거의 칼로리 두개를 입력하시오");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		System.out.println("연산자를 입력하세요");
		String temp = sc.next();	// "+" , "-"
		
		char op = temp.charAt(0);
		
		
		switch(op) {
		case '+':
			int result = calculator.add(su1, su2);
			System.out.println("햄버거 두 개의 칼로리 합은: "+result);
			break;
		case '-':
			int result2 = calculator.price(su1, su2);
			System.out.println("햄버거 두 개의 칼로리 차이는: "+result2);
			break;
		}
	}

	public static void main(String[] args) {
		
		
		계산기프로그램  p = new 계산기프로그램();
//		p.setCalculator(new Momstouch());
		p.setCalculator(new 버거킹());
		p.run();
		

	}

}
