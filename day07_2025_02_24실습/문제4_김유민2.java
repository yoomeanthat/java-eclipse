package day07_2025_02_24실습;

public class 문제4_김유민2 {

	public static void main(String[] args) {
		
		
		int[] result = 로또번호구하기();
		
		
		for(int lotto : result ) {
			System.out.println(lotto);
		}

	}
	
	
	/*
	 * 
	 * 함수 : 
	 * 입력 : X
	 * 반환 : O
	 * 
	 	public static int 함수만들기4(){
	 		return 3;
	 	}
	 	
	 */
	
	
	public static int[] 로또번호구하기() {
		
		
		int[] lotto= new int [6];
		
		for(int i=0;i<6;i++) {
			
			int index= (int) (Math.random() *45)+1;
			lotto[i] = index;
			
		}
		
		
		return lotto;
		};
		
	}


