package QuizApp;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    QuestionService(){
        questions[0] = new Question(0, "Which is the fastest language", "java", "python", "java Script", "Go", "Java");
        questions[1] = new Question(0, "Which is the Easiest language", "java", "python", "java Script", "Go", "Java");
        questions[2] = new Question(0, "Which is the Longest language", "java", "python", "java Script", "Go", "Java");
        questions[3] = new Question(0, "Which is the Hardest language", "java", "python", "java Script", "Go", "Java");
        questions[4] = new Question(0, "Which is the Slowest language", "java", "python", "java Script", "Go", "Java");

    }
    public void playQuiz() { // Fixed the method name
        int i = 0;
        String selection[] = new String[5];
        for(Question q: questions)
        {
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i]  = sc.nextLine();
            i++;
        }

        for(String s: selection)
        {
            System.out.println(s);
        }
    }
}