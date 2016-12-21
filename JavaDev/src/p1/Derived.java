package p1;

/**
 * Created by bilalsay on 08.10.2016.
 */
class Derived extends Protection {

    Derived() {
        System.out.println("derived constructor");
        System.out.println("n =" + n);

        // Yalnızca sınıfın kendisi erişebilir
        // System.out.println("n_pri =" + n_pri);
        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pub =" + n_pub);
    }

}
