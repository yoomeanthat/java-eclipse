package day08_2025_02_25;

public class 과자정보출력하기2 {

	public static void main(String[] args) {
		
		/*
		Snack2 obj1 = new Snack2();
		obj1.InfoSnack1();
		obj1.printSnack();
		
		Snack2 obj2 = new Snack2();
		obj2.InfoSnack2();
		obj2.printSnack();
		*/
		
		
		Snack2 obj = new Snack2();
		obj.InfoSnack3("오레오",
		"농심",
		"250kcal",
		"탄수화물:33g, 당류:30g, 지방:12g, 포화지방:5g, 단백질:2g",
		"300g",
		"2025_07_25",
		"1958_10_09");
		
		Snack2 obj2 = new Snack2();
		obj2.InfoSnack3("맛동산",
		"농심",
		"600kcal",
		"탄수화물:57g, 당류:21g, 지방:20g, 포화지방:4.6g, 단백질:8g",
		"600g",
		"2025_02_25",
		"1975_08_17");
		
		obj.printSnack();
		obj2.printSnack();
	}
}