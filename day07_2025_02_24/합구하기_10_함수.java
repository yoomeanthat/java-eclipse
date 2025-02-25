package day07_2025_02_24;

public class 합구하기_10_함수 {

	public static void main(String[] args) {
		
		
		
		
		//1 2 3 4 5 6 7 8 9 10
		
		getTentotal();
		int result = getTentotal2();
		System.out.println(result);
		
		
	}
	
	
	
			//함수명 getTentotal
			//기능 : 1~10까지합
			//입력 : X
			//반환 : X
	private static void getTentotal() {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
		
			sum = sum + i;	//sum += i;
		}
		
		System.out.println(sum);
	}
	
	
	
			//함수명 getTentotal2
			//기능 : 1~10까지합
			//입력 : X
			//반환 : O
	private static int getTentotal2() {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
		
			sum = sum + i;	//sum += i;
		}
		
		System.out.println(sum);
		
		return sum;
	}


}
