package day04_2025_02_19;

public class 인구구하기 {

	public static void main(String[] args) {
		
		double cityH=2500000;
		double cityK=1800000;
		
		int year=1999;
		
		while(cityK <=cityH) {
			
			year++;
			cityH = cityH *1.036;
			cityK = cityK *1.042;
					
		}
		
		System.out.println(year);

	}

}
