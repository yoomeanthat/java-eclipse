package day03;

public class 순서도문제2 {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		int num;
		
		while(sum<1000) {
			i++;
			num = 2*i-1;
			sum = sum+num;
		}
		System.out.println(i+"번째 항까지 더하면"+" 총합이"+sum+"이 되어 1000을 초과합니다");
	}

}
