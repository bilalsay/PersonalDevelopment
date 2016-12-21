package DataHW3;

public class DataStructure {

    private char stack[];
    private int top;

    DataStructure(int size) {
        this.stack = new char[size];
        this.top = -1;
    }

    public void push(char character) {
        if (top == this.stack.length - 1)
            System.out.println("Char stack is full");
        else
            this.stack[++top] = character;
    }

    public char pop() {
        if (top < 0)
            System.out.println("Char stack is empty");
        return this.stack[top--];

    }


}
