package day04_2025_02_19;

public class 피보나치 {

	public static void main(String[] args) {
		
		//1 2 3 4 5 6 7 ....50
		//1 1 2 3 5 8 13....
		
		
		long N=1;	// 피보나치 수열의 항
		long P=0;
		int CNT=1;
		
		while(CNT <=50) {
			System.out.println(N+",");
			N=P+N;
			P=N-P;
			CNT=CNT+1;	//CNT++
		}
		

	}

}
