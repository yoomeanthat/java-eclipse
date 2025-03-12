package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizManagerH {

    private ArrayList<Quiz> quizzes;
    private Random random;
    private Scanner sc;

    public QuizManagerH() {
        quizzes = new ArrayList<>();
        random = new Random();
        sc = new Scanner(System.in);
    }

    // 퀴즈 파일을 로드하는 메서드
    public void loadQuizzes(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Q.")) {
                    String question = line.substring(2);
                    ArrayList<String> optionsList = new ArrayList<>();
                    String answer = "";

                    while ((line = br.readLine()) != null && !line.startsWith("A. :")) {
                        optionsList.add(line);
                    }

                    if (line != null && line.startsWith("A. :")) {
                        answer = line.substring(4);
                    }

                    String[] optionsArray = optionsList.toArray(new String[0]);
                    quizzes.add(new Quiz(question, optionsArray, answer));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
        } catch (IOException e) {
            System.err.println("Error: Unable to read the file.");
        }
    }

    // 퀴즈를 진행하는 메서드
    public void startQuiz() {
        if (!quizzes.isEmpty()) {
            int quizCount = 0;

            while (!quizzes.isEmpty() && quizCount < 3) {
                // 남아있는 퀴즈 중에서 랜덤하게 선택
                Quiz randomQuiz = quizzes.get(random.nextInt(quizzes.size()));
                System.out.println("문제: " + randomQuiz.getQuestion());
                for (int i = 0; i < randomQuiz.getOptions().length; i++) {
                    System.out.println(randomQuiz.getOptions()[i]);
                }

                System.out.print("정답을 입력하시오: ");
                String userAnswer = sc.nextLine();

                // 정답 비교
                if (userAnswer.equals(randomQuiz.getAnswer())) {
                    System.out.println("정답입니다!");
                } else {
                    System.out.println("틀렸습니다. 유령이 3칸 전진합니다.");
                }

                // 퀴즈를 한 번 나온 후 제거
                quizzes.remove(randomQuiz); // 맞추든 틀리든 간에 제거
                quizCount++;
            }

            if (quizCount == 3) {
                System.out.println("퀴즈가 3개 끝났습니다.");
            }

        } else {
            System.out.println("No quizzes available.");
        }
    }

   
}
