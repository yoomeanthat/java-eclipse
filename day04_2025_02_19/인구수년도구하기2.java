package day04_2025_02_19;

public class 인구수년도구하기2 {

	public static void main(String[] args) {
		
		
		
		double K_si = 1800000;
		double H_si = 2500000;
		int index = 0;
		int years = 1999;
		
		
		while(K_si <= H_si) {	//조건이 만족할 동안 반복함
			
			
			K_si = K_si *1.042;
			H_si = H_si*1.036;
			index++;	//index = index+1;
			
		}
		
		
		years = years + index;
		
		
		System.out.println(years);

	}

}
