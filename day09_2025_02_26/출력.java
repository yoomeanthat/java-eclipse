package day09_2025_02_26;

public class 출력 {

	public static void main(String[] args) {
		data k = new data();
		
		//입력하기
		/*k.a = "ㅇㅇ";
		k.b = 21432;
		k.c = 4253;
		
		*/
		입력하기(k);

		//데이터 출력하기 
		//System.out.println(k.a+","+k.b+","+k.c);
		출력하기(k);
		
	}
	
	
	
	public static void 입력하기( data k) {
		
		//k.a = "ㅇㅇ";
		k.name = "ㅇ ㅇ";
		k.b = 21432;
		k.c = 4253;
		k.d = 5154;
	}
	
	
	public static void  출력하기(data k) {
		//추가된 속성 d도 출력될 수 있도록 코드를 수정해야 한다
		System.out.println(k.name+","+k.b+","+k.c+k.d);
	}
	
	
	

}
