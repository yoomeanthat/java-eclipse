package day04;

public class 이동우_초과항구하기 {

	public static void main(String[] args) {
		 
		
		int n=1;
		int sum=0;
		
		
		while( sum < 20) {
			sum = sum+n;
			n= n+2;	
			
			System.out.println( sum);
			System.out.println( n);
		}
		
		n= n-2;  //공차  :2
		System.out.println( sum  + ", " + n);

	}

}
