package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizManagerN2 {

    public static void main(String[] args) {

        ArrayList<Quiz> quizzes = new ArrayList<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Easy 난이도 퀴즈에서 Q.로 시작하는 것 읽어오기, 해당 Q의 A가 비어있는지 확인한 뒤 정답을 비교
        try (BufferedReader br = new BufferedReader(new FileReader("res/QuizN.txt"))) {
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

        // 퀴즈를 랜덤하게 고르기
        if (!quizzes.isEmpty()) {
            int quizCount = 0;

            while (!quizzes.isEmpty() && quizCount < 3) {
                // 남아있는 퀴즈 중에서 다시 랜덤하게 고르기
                Quiz randomQuiz = quizzes.get(random.nextInt(quizzes.size()));
                System.out.println("문제:" + randomQuiz.getQuestion());
                for (int i = 0; i < randomQuiz.getOptions().length; i++) {
                    System.out.println(randomQuiz.getOptions()[i]);
                }

                System.out.print("정답을 입력하시오: ");
                String userAnswer = sc.nextLine();

                // 정답이랑 사용자의 입력값을 비교
                if (userAnswer.equals(randomQuiz.getAnswer())) {
                    System.out.println("정답입니다!");
                } else {
                    System.out.println("틀렸습니다. 유령이 3칸 전진합니다");
                }

                // 한 번 나온 퀴즈를 제거하기
                quizzes.remove(randomQuiz); // 맞추든 틀리든 간에 제거
                quizCount++;
            }

            // If we have asked 3 questions
            if (quizCount == 3) {
                System.out.println("퀴즈가 3개 끝났습니다.");
            }

        } else {
            System.out.println("No quizzes available.");
        }

        
    }
}
