package DataHW3;

public class DataStructure<T> {

    private T[] stack;
    private int top;

    DataStructure(int size) {
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T character) {
        if (top == this.stack.length - 1)
            System.out.println("Char stack is full");
        else
            this.stack[++top] = character;
    }

    public T pop() {
        if (top < 0)
            System.out.println("Char stack is empty");
        return this.stack[top--];

    }

}
