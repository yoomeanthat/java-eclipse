package day04_2025_02_19;

public class 피보나치분수항3 {

	public static void main(String[] args) {
		
		
		int i, j, n, mul;
		double su;
		double sum;
		
		i=j=n=mul=1;
		su=sum=0;
		
		
		while(n <=10) {
			
			//분모구하기
			while(i<=n) {	//n=3	=> i : 1~3까지 반복
				mul = mul*i;	//1*2*3
				i++;
				
			}
			
			su = n/(double)mul *j;
			sum = sum + su;
			
			//
			i=mul=1;
			
			n++;
			
			//부호
			j=j*-1;	//j=-j;
			
		}
		
		System.out.println(sum);
	}

}
