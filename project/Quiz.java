package project;

public class Quiz {
	
	//문제 내용
	String content;
	
	//문제 답
	String answer;
	
	//생성자
	public Quiz(String content, String answer) {
		this.content = content;
		this.answer = answer;
	}
	
	//답 확인하는 메서드
	public boolean isCorrect(String answer) {
		this.answer = answer;
		return false;
	}
}
