package day05_2025_02_20;

public class 실습_배열기본문제2_김유민 {

	public static void main(String[] args) {
		
		int [] Temperatures = {33,35,32,35,36,35,34};
		int total=0;
		int count=0;
		int max =33;
		
		int count_over_avg=0;
		

		for(int i=0;i<Temperatures.length;i++) {
			System.out.println("이번 주 날씨는 :"+Temperatures[i]);
		}
		
		for(int i=0;i<Temperatures.length;i++) {
			total += Temperatures[i];
		}
		
		System.out.println();
		System.out.println("이번 주 평균 온도는:"+ (double)total/Temperatures.length);
	
		
	
		for(int i=0; i<Temperatures.length;i++) {
			if(Temperatures[i]>35) {
				count++;
			}
		}
			
		
		
		
		
		System.out.println("이번 주 35도를 넘는 횟수는 "+ count+"회 입니다");
		
		for(int i=0; i<Temperatures.length; i++) {
			if(Temperatures[i]>max) {
				max=Temperatures[i];
			}
			
		}System.out.println("최고 온도는: "+max+"도 입니다");
		
		
		//배열응용문제3-2번 배열의 평균값보다 큰 요소의 개수 구하기 
		for(int i=0; i<Temperatures.length;i++) {
			if(Temperatures[i]>(double)total/Temperatures.length) {
				count_over_avg++;
			}
			
		}System.out.println("평균값보다 큰 요소의 개수는 "+count_over_avg+"개 입니다");
		
		
		
	}

}
