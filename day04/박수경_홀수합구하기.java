package day04;

public class 박수경_홀수합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 3 5 7 9 .....99
		
		int n=-1;  //항 
		int odd_sum=0;
		
		
		while( n<10) {
			n=n+2;         // 1    3   
			System.out.print( n +",");
			odd_sum = odd_sum  + n;   //1   4
			 
		}
		
		System.out.println( odd_sum);
		

	}

}
