package QuizApp;

import QuizApp.Question;


public class questionService {

    Question[] questions = new Question[5];

    questionService(){
        questions[0]  = new Question(1,"what is the fastest language", "java"
        ,"Python", "c++", "c", "c");
        questions[1]  = new Question(1,"what is the fastest language", "java"
                ,"Python", "c++", "c", "c");
        questions[2]  = new Question(1,"what is the fastest language", "java"
                ,"Python", "c++", "c", "c");
        questions[3]  = new Question(1,"what is the fastest language", "java"
                ,"Python", "c++", "c", "c");
        questions[4]  = new Question(1,"what is the fastest language", "java"
                ,"Python", "c++", "c", "c");
    }


    public void display(){
        for(Question q : questions){
            System.out.println(q);
        }
    }

}
