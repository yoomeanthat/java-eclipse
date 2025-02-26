package day08_2025_02_25;

public class 과자정보출력하기1 {

	public static void main(String[] args) {
		
		Snack obj = new Snack();
		
		InfoSnack1(obj);
		printSnack(obj);
		InfoSnack2(obj);
		printSnack(obj);
	}
	
	
	public static void InfoSnack1(Snack obj) {
		
		
		obj.name="맛동산";
		obj.company="농심";
		obj.calories="600kcal";
		obj.info="탄수화물:57g, 당류:21g, 지방:20g, 포화지방:4.6g, 단백질:8g";
		
		obj.gram= "600g";
		obj.expDate= "2025_02_25";
		obj.bornyear="1975_08_17";
	
	}
	
	public static void InfoSnack2(Snack obj) {
		obj.name="오레오";
		obj.company="농심";
		obj.calories="250kcal";
		obj.info="탄수화물:33g, 당류:30g, 지방:12g, 포화지방:5g, 단백질:2g";
		
		obj.gram= "300g";
		obj.expDate= "2025_07_25";
		obj.bornyear="1958_10_09";
	}
	
	
	
	
	
	public static void printSnack(Snack obj) {
		System.out.println("과자이름: "+obj.name);
		System.out.println("제조사: "+obj.company);
		System.out.println("칼로리: "+obj.calories);
		System.out.println("영양정보: "+obj.info);
		System.out.println("무게: "+obj.gram);
		System.out.println("유통기한: "+obj.expDate);
		System.out.println("출시일: "+obj.bornyear);
		System.out.println("============");
	}
}