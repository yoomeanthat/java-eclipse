package day14.인터페이스실습;

public class 맘스터치 implements Calculator{

	@Override
	public int add(int su1, int su2) {
		System.out.println("맘스터치 칼로리총합: ");
		return su1+su2;
	}

	@Override
	public int price(int price1, int price2) {
		System.out.println("맘스터치 칼로리차이: ");
		return price1+price2;
	}

}
