package stack_package;

/**
 * Created by bilalsay on 08.10.2016.
 */
public class DynamicStack implements IntStack{

    private int stck[];
    private int tos;

    DynamicStack(int beginigSize) {
        stck = new int[beginigSize];
        tos = -1;
    }

    public void push(Object item) {
        if (tos == stck.length - 1) {
            int tmp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) tmp[i] = stck[i];
            stck = tmp;
            stck[++tos] = (int)item;
        } else {
            stck[++tos] = (int)item;
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
