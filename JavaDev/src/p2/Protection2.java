package p2;

/**
 * Created by bilalsay on 08.10.2016.
 */
class Protection2 extends p1.Protection {

    Protection2() {
        System.out.println("derived other package constructor");

        // yalnızca sınıf veya paket
        // System.out.println("n =" + n);

        // yalnızca sınıf
        // System.out.println("n_pri =" + n_pri);

        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pub =" + n_pub);

    }
}
