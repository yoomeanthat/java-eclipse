package day13.생성자실습.김유민;

public class 김유민 extends Acorn{
	
	private String email;
	private String nickname;
	
	
	public 김유민(String id, String name, String phone, String email, String nickname) {
		
		super(id, name, phone);
		
		this.email=email;
		this.nickname=nickname;
	}
	
	@Override
	public void printInfo() {
		System.out.println("아이디: "+ id);
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("이메일: " + email);
		System.out.println("별명: "+ nickname);
	}
}
