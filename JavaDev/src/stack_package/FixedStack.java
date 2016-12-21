package stack_package;

/**
 * Created by bilalsay on 08.10.2016.
 */
public class FixedStack implements IntStack {


    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(Object item) {
        if(tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            if (item.equals('+')) {
                stck[--tos] = (stck[tos] + stck[tos + 1]);
            } else if(item.equals('-')) {
                stck[--tos] = (stck[tos] - stck[tos + 1]);
            } else if(item.equals('*')) {
                stck[--tos] = (stck[tos] * stck[tos + 1]);
            } else if(item.equals('/')) {
                stck[--tos] = (stck[tos] / stck[tos + 1]);
            } else {
                stck[++tos] = (int)item;
            }

        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
