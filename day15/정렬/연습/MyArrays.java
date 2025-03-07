package day15.정렬.연습;

public class MyArrays {
	
	//MyComparable
	public static void sort1(Object[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				MyComparable item = (MyComparable)arr[i];
				
				if(item.compareTo(arr[j]) > 0) {
					Object temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//MyComparator
	public static void sort2(Object[] arr, MyComparator c) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0) {
					Object temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
