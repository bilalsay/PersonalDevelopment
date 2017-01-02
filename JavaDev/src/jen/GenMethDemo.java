package jen;

/**
 * Created by bilalsay on 24.12.2016.
 */
public class GenMethDemo {


    // bir nesnenin bir dizi içinde olup olmadığını belirle
    static <T, V extends T> boolean isIn(T x, V[] y) {
        for (V eachY: y)
            if (x.equals(eachY)) return true;

        return false;
    }

    public static void main(String args[]) {

        // isIn methodunu   Integerler üzerinde kullan
        Integer[] nums = {1,2,3,4,5};
        if (isIn(2,nums))
            System.out.println("2 is in nums");

        if (isIn(7,nums))
            System.out.println("7 is in numssss");

        System.out.println();

        // isIn methodunu String ler üzerinde kullan

        String[] strs = {"one","two","three","four","five"};
        if (isIn("two", strs))
            System.out.println("two is in strs");

        if (isIn("seven",strs))
            System.out.println("7 is not in nums");


        /* Hata! Bu bölüm derlenemz tipler uymlu olmalı */

        if (isIn("two", nums))
            System.out.println("two is in strs");
    }
}
