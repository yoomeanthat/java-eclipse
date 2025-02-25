package day08_2025_02_25;

public class 수증가하기 {

	public static void main(String[] args) {
		
		
		int index=0;	//지역변수 (main에서만 사용가능함)
		
		index++;
		System.out.println(index);
		
		index++;
		System.out.println(index);
		
		index = 수증가하기(index);
		System.out.println(index);
		
		
		
		

	}
	
	
	//
	public static int 수증가하기(int index) {
		
		index++;
		System.out.println(index);
		
		return index;
		
		
	}

}
