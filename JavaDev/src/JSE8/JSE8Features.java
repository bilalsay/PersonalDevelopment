package JSE8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by bilalsay on 04.12.2016.
 */


interface Printer{
        void print(String val);
}

class LamdaDemo {
    public void printSomething(String something, Printer printer) {
        printer.print(something);
    }
}

class Person {
    private int age;
    private int height;

    Person(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }
}

public class JSE8Features {

    public static void main(String args[]) {
        List<Integer> i = new ArrayList<>();

        i.stream();

        LamdaDemo demo = new LamdaDemo();
        /*Printer print = new Printer() {
            @Override
            public void print(String val) {
                System.out.print(val);
            }
        };

        Printer print = (String toPrint) -> {System.out.print(toPrint);};
        demo.printSomething("bilalsay", print);
*/
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        //.limit(2)
                        .collect(toList());
                        */

        Person p1 = new Person(12, 150);
        Person p2 = new Person(20, 200);
        Person p3 = new Person(8, 100);

        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        List<Person> list = people.stream()
                                .filter(t -> t.getHeight() > 100)
                                .collect(toList());

        for (Person p: list) {
            System.out.println(p.getAge());
        }
    }
}
