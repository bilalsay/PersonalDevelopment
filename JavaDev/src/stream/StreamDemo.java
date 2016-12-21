package stream;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by bilalsay on 13.12.2016.
 */
public class StreamDemo {

    public static void main(String args[]) {
        /* path in stream e aktarılması
        try {

            Path dir = Paths.get("/var/log");
            Stream pathStream = Files.list(dir);
            Predicate predicate = eachPath -> eachPath.toString().length() <= 13;
            pathStream
                    .filter(eachPath -> eachPath.toString().length() <= 13)  //böylede olur -> .filter(predicate)
                    .forEach(System.out::println); // böylede olur -> pathStream.forEach(eachPath-> System.out.println(eachPath))


        } catch(IOException e) {}
        */
        /* integer ile kullanımı
        IntStream iStream = IntStream.of(1, 1, 2, 3, 13, 5, 8, 13, 8);
        IntStream rangeStream = IntStream.range(1,10);
        IntStream rangeClosedStream = IntStream.rangeClosed(1,10);
        rangeStream
                .limit(20) // baştan kaç eleman alınacak
                .sorted() // sıralar
                .distinct() // tekrarlayan değerleri tek bir tane alır
                .forEach(System.out::println);
        */

        List names = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");

        names.stream()
                .map(name -> name.toString().toLowerCase())
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 10)
                .map(n -> n * n)
                .forEach(System.out::print);

        int result = IntStream
                .of(1, 2, 3, 4, 5)
                .reduce(0, (once, sonra) -> {
                    System.out.format("%d - %d %n", once, sonra);
                    return once + sonra;
                });
        System.out.println(result);

        Person p1 = new Person("Ahmet", 12);
        Person p2 = new Person("Ali", 20);
        Person p3 = new Person("Ayşe", 30);
        Person p4 = new Person("Murat", 51);
        Person p5 = new Person("Zeynep", 60);

        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);

        Comparator<String> byLength = (s1, s2) -> Integer.compare( s1.length(), s2.length());
        Optional<String> max = Stream.of("hello","good bye", "black", "white", "good", "bad")
                .max(byLength);
        System.out.println();

        Optional<String> opt = Optional.of("Hello");
        opt.filter((str) -> str.length() < 6);
        System.out.println(opt.get());



       /* Stream stream = personList
                .stream()
                .map(p -> p.getAge())
                .map(Double::valueOf)
                .reduce(0, (a, b) -> (a + b) / 2);

        /* Çeşitli collect ler
        List<String> list = (List) names.stream().collect(Collectors.toList());
        Set set = (Set) names.stream().collect(Collectors.toSet());
        Long count = (Long) names.stream().collect(Collectors.counting());
        String collect = (String) names.stream().collect(Collectors.joining("-"));
        Map<Integer, List> integerListMap = (Map<Integer, List>) names.stream().collect(Collectors.groupingBy(n -> n.toString().length()));
        System.out.println(collect);
        System.out.println(integerListMap.size());
        */


    }
}
