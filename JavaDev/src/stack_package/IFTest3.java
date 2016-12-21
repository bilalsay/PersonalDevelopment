package stack_package;

/**
 * Created by bilalsay on 08.10.2016.
 */
public class IFTest3 {

    public static void main(String args[]) {
        IntStack mystack;
        //DynamicStack ds = new DynamicStack(5);
        FixedStack fs = new FixedStack(11);

        /*
        mystack = ds;
        for (int i = 0; i < 22; i++) mystack.push(i);

        mystack = fs;
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Values is dynamic stack: ");
        for (int i = 0; i < 22;i++ ) System.out.println(mystack.pop());
        */
        mystack = fs;
        mystack.push(20);
        mystack.push(2);
        mystack.push(3);
        mystack.push('*');
        mystack.push('+');
        mystack.push(2);
        mystack.push(8);
        mystack.push('*');
        mystack.push(5);
        mystack.push('+');
        mystack.push(4);
        mystack.push('*');
        mystack.push('+');

        System.out.println("Postfix mathematical process result: ");

        for (int i = 0; i < 1; i++) System.out.println(mystack.pop());


    }
}
