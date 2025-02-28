package day11_2025_02_28;


class Lotto{
	
	static int[] Lotto = new int[5];
	//static int cnt;	// 기본값 초기화
	static int cnt = 5;	// 명시적 초기화
	
	
	
	
	//static 초기화 블럭
	static {
		
		//
		for( int i=0; i<Lotto.length; i++) {
			int random = (int) (Math.random()*45) + 1;	//0~44 +1
			Lotto[i] = random;
		}
	}
	
	
	public static void printLotto() {
		//System.out.println(Lotto);
		for( int i=0; i<Lotto.length; i++) {
			System.out.print(Lotto[i] + ",");
		}
	}
	
	
	public static void printCnt() {
		System.out.println(cnt);
	}
	
	
	//매서드로 배열의 값을 변경하기
	//호출해야만 실행된다
	public static void init() {
		
		//
		for( int i=0; i<Lotto.length; i++) {
			int random = (int) (Math.random()*45) + 1;	//0~44 +1
			Lotto[i] = random;
		}
		
	}
}


public class 클래스변수초기화 {

	public static void main(String[] args) {
		
		Lotto.init();
		Lotto.printLotto();
		Lotto.printCnt();
		
		
		
		/*
		 * 클래스변수초기화 방법과 순서
		 * 1.기본값으로 초기화
		 * 2.명시적 초기화
		 * 3.스태틱 초기화 블럭 : 복잡한 초기화
		 * 	 static {
		 * 
		 * 	}
		 * 
		 * 
		 */
		
		
		//프로그램의 시작 순서 main에서 시작함
		//static 정보가 먼저 로드됨
		//static 초기화블럭이 실행됨
		//static main을 실행시킴
	
	}

}
