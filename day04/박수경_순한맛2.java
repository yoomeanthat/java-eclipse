package day04;

public class 박수경_순한맛2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// 1  (1+2)   (1+2+3)   (1+2+3+4)  (1+2+3+4+5) ...100
		
		
		 int n=1;
		 int sum=0;
		 int total_sum=0;
		 
		 while( n < 101) {
			 sum = n*( n+1) /2;
			 System.out.print( sum +",");
			 total_sum  = total_sum  + sum;	
			 n++;
			 
		 }
		 
		 System.out.println( total_sum);
		

	}

}
