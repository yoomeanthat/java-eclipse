package day04_2025_02_19;

public class 순한맛2번_4 {

	public static void main(String[] args) {
		
		
		//1		2		3		4			5
		//1	  (1+2)  (1+2+3) (1+2+3+4) (1+2+3+4+5)
		
		
		//int k;//항을 만들기 위해서 반복하는 제어변수 (내부반복제어변수)
		//int i=1;//항의 순번, 전체반복을 제어하는 변수
		int sum=0;
		
		
		for(int i=1;i<=5;i++) {
			
			for(int k=1; k<=i;k++) {
				sum=sum+k;
			}
		}
		
		System.out.println(sum);
		
	}

}
