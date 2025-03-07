package day15.정렬.연습;

public class Main {

	public static void main(String[] args) {
		Score[] arr = new Score[5];
		
		arr[0] = new Score("김씨", 100, 90);
		arr[1] = new Score("이씨", 99, 90);
		arr[2] = new Score("박씨", 89, 100);
		arr[3] = new Score("최씨", 88, 77);
		arr[4] = new Score("조씨", 85, 89);
		
		MyArrays.sort1(arr);
		System.out.println("국어순 정렬 ==>");
		for(int i = 0; i < arr.length; i++) {
			Score score = arr[i];
			System.out.println(score);
		}
		
		MyArrays.sort2(arr, new A());	
		System.out.println("\n영어순 정렬 ==>");
		for(int i = 0; i < arr.length; i++) {
			Score score = arr[i];
			System.out.println(score);
		}

	}

}
