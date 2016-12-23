package DataHW3;

public class ReverseChecker {

    private DataStructure<Character> charStack;

    public ReverseChecker control(String sentence) {

        sentence = modifySentence(sentence);

        this.charStack = new DataStructure<Character>(sentence.length());

        storeCurrentSentence(sentence);

        if (check(sentence))
            System.out.println("This sentence is same its reversed sentence");
        else
            System.out.println("This sentence isn't same its reversed sentence");
        return this;

    }

    private boolean check(String sentence) {
        if (sentence.equalsIgnoreCase(reverseSentence(sentence)))
            return true;
        return false;
    }

    private String reverseSentence(String sentence) {
        String reversedSentence = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversedSentence += charStack.pop();
        }
        return reversedSentence;
    }

    private void storeCurrentSentence(String sentence) {

        for(char letter: sentence.toCharArray())

            this.charStack.push(letter);
    }

    private String modifySentence(String sentence) {

        return sentence.trim().replaceAll("\\W", "");

    }

}
