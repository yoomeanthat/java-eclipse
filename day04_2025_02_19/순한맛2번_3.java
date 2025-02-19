package day04_2025_02_19;

public class 순한맛2번_3 {

	public static void main(String[] args) {
		
		
		//1		2		3		4			5
		//1	  (1+2)  (1+2+3) (1+2+3+4) (1+2+3+4+5)
		
		
		int k;//항을 만들기 위해서 반복하는 제어변수 (내부반복제어변수)
		int i=1;//항의 순번, 전체반복을 제어하는 변수
		int sum=0;
		
		
		while(i<=100) {
			
			k=1;
			while(k<=i) {
				sum=sum+k;
				k=k+1;
			}
			
			i=i+1;
		}
		
		System.out.println(sum);
		
	}

}
