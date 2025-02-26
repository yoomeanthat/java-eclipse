package day09_2025_02_26;

public class 객체실습2_김유민 {
	
	 long shoppingNum;
	 String id;
	 String date;
	 String userName;
	 String productNum;
	 String address;
	 
	 public void input(long shoppingNum ,String id, String date, String userName, String productNum, String address) {
		 this.shoppingNum = shoppingNum;
		 this.id = id;
		 this.date = date;
		 this.userName = userName;
		 this.productNum = productNum;
		 this.address = address;
	 }
	 
	 public void printInfo() {
		 System.out.println("주문번호: "+this.shoppingNum);
		 System.out.println("주문자아이디: "+this.id);
		 System.out.println("주문날짜: "+this.date);
		 System.out.println("주문자이름: "+this.userName);
		 System.out.println("주문상품번호: "+this.productNum);
		 System.out.println("배송주소: "+this.address);
	 }
	 
}
