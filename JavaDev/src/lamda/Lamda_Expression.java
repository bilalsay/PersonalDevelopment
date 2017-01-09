package lamda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bilalsay on 05/01/2017.
 */
public class Lamda_Expression {

    interface Lamda {
        int calistir(int x);
    }

    public static void main(String args[]) {
        /*Lamda l = (int x) -> (x * x); // Yukarıda interface de fonksiyonun içeriğini tanımlamadık onun yerine burada tanımladık

        System.out.println(l.calistir(5));
        */
        List<Integer> list = Arrays.asList(1,2,3);
        int sum = list.stream().map(x -> x * x).reduce((x,y) -> x + y).get();

        System.out.println(sum);


    }
}
