package Project2;

public class Main {
    
    public static void main(String[] args) {
        
        // 퀴즈 매니저 객체 생성
        QuizManager qm = new QuizManager();
        
        // 난이도 0(쉬운 난이도)으로 퀴즈 파일 로드
        qm.quizSetting(0);
        
        // 퀴즈 푸는 메서드 실행, 난이도 0으로 퀴즈 진행
        boolean result = qm.answerCheck(0);
        
        // 퀴즈 결과 출력
//        if (result) {
//            System.out.println("퀴즈를 모두 맞췄습니다!");
//        } else {
//            System.out.println("퀴즈를 틀렸습니다.");
//        }

        
        // 해당 퀴즈 삭제
        if (!QuizManager.easy.isEmpty()) {
            Quiz firstQuiz = QuizManager.easy.get(0);
            qm.quizRemove(firstQuiz, QuizManager.easy);
        }
    }
}
