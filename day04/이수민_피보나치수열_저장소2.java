package day04;

public class 이수민_피보나치수열_저장소2 {

	public static void main(String[] args) {
	 
		
		
		// 1  1  2  3    5    8   13   21
		
		 long num1=0;
		 long num2=1;
		 int cnt=1;
		 
		 while( cnt  <=50) {
			 
			 System.out.print( num2  +",");
			 num1 = num1+num2;			 
			 System.out.print( num1 +",");			 
			 num2 = num2+ num1;			 
			 cnt= cnt+2;			 
			 
		 }

	}

}
