package project;

import java.util.Random;

public class QuizMain {

    public static void main(String[] args) {
    	
        QuizMain qm = new QuizMain(); 
        qm.QuizRun(); // 메서드 호출
    }

    public void QuizRun() {
        Random random = new Random();
        int randomNumber = random.nextInt(3); // 0, 1, 2 중 하나의 숫자 선택

        switch (randomNumber) {
            case 0:
                QuizManagerE quizManagerE = new QuizManagerE();
                quizManagerE.loadQuizzes("res/QuizE.txt");
                quizManagerE.startQuiz();
                break;
            case 1:
                QuizManagerN quizManagerN = new QuizManagerN();
                quizManagerN.loadQuizzes("res/QuizN.txt");
                quizManagerN.startQuiz();
                break;
            case 2:
                QuizManagerH quizManagerH = new QuizManagerH();
                quizManagerH.loadQuizzes("res/QuizH.txt");
                quizManagerH.startQuiz();
                break;
            default:
                System.out.println("잘못된 숫자입니다.");
        }
    }
}
