package day06_2025_02_21;

public class new연산자와참조형변수 {

	public static void main(String[] args) {
		
		int[]arr = new int[3];
		
		//배열의 크기를 공간을 얻으려면 new라는 키워드를 사용하여 메모리를 요청해야 합니다.
		//new 메모리 요청하고 확보된 메모리의 주소를 반환합니다.
		//주소를 기억하고 그 주소를 통해서 배열에 접근한다.
		//=> 그래서 주소를 기억할 수 있는 변수, 참조형변수가 나오게 된다
		
		arr[0] =98;
		arr[1] =78;
		arr[2] =100;
	}

}
