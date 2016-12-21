package mainpackage;

/**
 * Created by bilalsay on 01.10.2016.
 */
public class StaticCompile {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialize");
        b = a * 4;
    }

    public static void main(String args[]) {
        meth(42);
    }
}
