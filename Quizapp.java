package MultipleChoiceApp;
import java.util.*;
public class Quizapp {
    public static void main(String args[])
    {
        String q1="What colors are Apples?\n"
                +"(a)red/green\n(b)orange\n(c)magenda\n";
        String q2="What colors are Bananas?\n"
                +"(a)red/green\n(b)yellow\n(c)blue\n";
        Question[] questions={
                new Question(q1,"a"),
                new Question(q2,"b")
        };
        takeTest(questions);
    }
    public static void takeTest(Question[] questions)
    {
        int score=0;
        Scanner scc=new Scanner(System.in);
        for(int i=0;i<questions.length;i++)
        {
            System.out.println(questions[i].prompt);
            String answer=scc.nextLine();
            if(answer.equals(questions[i].answer));
            {
                score++;
            }
        }
        System.out.println("You got : "+score+"/"+questions.length);
    }
}
