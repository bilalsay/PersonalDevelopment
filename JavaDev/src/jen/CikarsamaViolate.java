package jen;

/**
 * Created by bilalsay on 3.01.2017.
 */

class A<T,V>{}
class B<T,V> extends A<T,V>{}
class MyClasss<T,V> {
    T ob1;
    V ob2;

    MyClasss(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;

    }
}

public class CikarsamaViolate {

public static void main(String args[]) {
    try {
        MyClasss<A<Integer, Long>, String> mcOb2 = new MyClasss<>(new B<Integer, Long>(), "Generics");

    } catch(Exception e) {
        System.out.print(e.getMessage());
    }
}

}
