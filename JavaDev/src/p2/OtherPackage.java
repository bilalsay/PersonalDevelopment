package p2;

/**
 * Created by bilalsay on 08.10.2016.
 */
class OtherPackage {

    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("other package constructor");

        // yalnızca sınıf veya paket
        // System.out.println("n =" + p.n);

        // yalnızca sınıf
        // System.out.println("n_pri =" + p.n_pri);

        // yalnızca sınıf, alt sınıf veya pake
        // System.out.println("n_pro =" + p.n_pro);

        System.out.println("n_pub =" + p.n_pub);

    }

}
