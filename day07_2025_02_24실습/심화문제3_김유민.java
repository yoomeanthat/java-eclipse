package day07_2025_02_24실습;

public class 심화문제3_김유민 {

	public static void main(String[] args) {
		
		String [] arr = new String [] {"흐림", "맑음", "구름", "번개", "비", "바람", "우박"} ;
		
		weekWeather(arr);
		
		

	}
	
	public static void weekWeather(String arr[]) {
		
		System.out.println("월요일 날씨는: "+arr[0]);
		System.out.println("화요일 날씨는: "+arr[1]);
		System.out.println("수요일 날씨는: "+arr[2]);
		System.out.println("목요일 날씨는: "+arr[3]);
		System.out.println("금요일 날씨는: "+arr[4]);
		System.out.println("토요일 날씨는: "+arr[5]);
		System.out.println("일요일 날씨는: "+arr[6]);
		
	}

}
