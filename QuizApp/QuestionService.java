package QuizApp;

public class QuestionService {
    
    Question[] questions = new Question[5];

    public void getQuestion(){
        System.out.println("getting the Questions");
        for(int i=0;i< questions.length;i++)
        {
            System.out.println(questions[i]);
        }
    }

}
