package day08_2025_02_25;

public class 과자정보출력하기1 {

	public static void main(String[] args) {
		
		Snack obj1 = new Snack();
		obj1.name="맛동산";
		obj1.company="농심";
		obj1.calories="600kcal";
		obj1.info="탄수화물:57g, 당류:21g, 지방:20g, 포화지방:4.6g, 단백질:8g";
		
		obj1.gram= "600g";
		obj1.expDate= "2025_02_25";
		obj1.bornyear="1975_08_17";
		
		
		Snack obj2 = new Snack();
		obj2.name="오레오";
		obj2.company="농심";
		obj2.calories="250kcal";
		obj2.info="탄수화물:33g, 당류:30g, 지방:12g, 포화지방:5g, 단백질:2g";
		
		obj2.gram= "300g";
		obj2.expDate= "2025_07_25";
		obj2.bornyear="1958_10_09";
		
		printSnack(obj1);
		printSnack(obj2);
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
