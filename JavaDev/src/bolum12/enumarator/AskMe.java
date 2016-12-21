package bolum12.enumarator;

import java.util.Random;

/**
 * Created by bilalsay on 19.11.2016.
 */

class Question {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15)
            return Answers.MAYBE;
        else if (prob < 30)
            return Answers.NO;
        else if(prob < 60)
            return Answers.YES;
        else if(prob < 75)
            return Answers.LATER;
        else if(prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    }

}


public class AskMe {

    static void answer(Answers result) {

        switch(result) {

            case NO:
                System.out.println("No");
                break;

            case YES:
                System.out.println("Yes");
                break;

            case MAYBE:
                System.out.println("Maybe");
                break;

            case LATER:
                System.out.println("Later");
                break;

            case SOON:
                System.out.println("Soon");
                break;

            case NEVER:
                System.out.println("Never");
                break;
        }

    }


    public static  void main(String args[]) {
        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());


    }
}
