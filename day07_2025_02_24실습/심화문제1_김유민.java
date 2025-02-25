package day07_2025_02_24실습;

public class 심화문제1_김유민 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int evennum = even(arr);
		
		System.out.println("짝수의 개수는 "+evennum+" 입니다");
	}
	
	public static int even(int[] arr) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				index++;
			}
		}
		
		return index;
		
		
	}
}
