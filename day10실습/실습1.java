package day10실습;

public class 실습1 {
	
	String title;
	String author;
	int price;
	
	
	public 실습1() {
		
	}
	
	public 실습1(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return title +"   "+ author + "   "+price;
	}
}
