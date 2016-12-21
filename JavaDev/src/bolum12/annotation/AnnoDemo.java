package bolum12.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by bilalsay on 19.11.2016.
 */

public class AnnoDemo {
    @MyAnno(str = "Annotation example", val = 100)
    public static void myMeth(String str, int i) {
        AnnoDemo ob = new AnnoDemo();
        try {
            // Önce bu sınıfı temsil eden bir class nesnesi
            Class<?> c = ob.getClass();

            // Şimdi bu methodu temsil eden bir method nesnesi
            //Method m = c.getMethod("myMeth"); // notunu aldığımız methodun hiç parametresi yoksa
            Method m = c.getMethod("myMeth", String.class, int.class);

            // Daha sonra bu sınıf için notu elde et
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // Son olarak değerleri görüntüle

            System.out.println("Notun içeriği: " + anno.str() + " Notun değeri: " + anno.val());
        } catch(NoSuchMethodException e){

        }

    }

    public static void main(String args[]) {
        myMeth("Test", 10);
    }
}
