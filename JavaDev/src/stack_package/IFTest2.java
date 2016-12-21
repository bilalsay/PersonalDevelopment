package stack_package;

/**
 * Created by bilalsay on 08.10.2016.
 */
public class IFTest2 {

    public static void main(String args[]) {
        DynamicStack mystack1 = new DynamicStack(5);
        DynamicStack mystack2 = new DynamicStack(8);

        for (int i = 0; i < 22; i++) mystack1.push(i);
        for (int i = 0; i < 30; i++) mystack2.push(i);

        System.out.println("Stack in mystack1: ");
        for (int i = 0; i < 22;i++ ) System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 30; i++) System.out.println(mystack2.pop());
    }
}
