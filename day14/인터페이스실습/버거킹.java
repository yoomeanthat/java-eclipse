package day14.인터페이스실습;

public class 버거킹 implements Calculator{

	@Override
	public int add(int cal1, int cal2) {
		System.out.println("버거킹 칼로리총합: ");
		return cal1+cal2;
	}

	@Override
	public int price(int price1, int price2) {
		System.out.println("버거킹 가격총합: ");
		return price1+price2;
	}

}
