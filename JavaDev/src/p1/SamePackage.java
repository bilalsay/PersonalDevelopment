package p1;

/**
 * Created by bilalsay on 08.10.2016.
 */
class SamePackage {

    SamePackage() {
        Protection p = new Protection();

        System.out.println("Same package constructor");
        System.out.println("n =" + p.n);

        // yalnızca sınıf
        // System.out.println("n_pri =" + p.n_pri);

        System.out.println("n_pro =" + p.n_pro);
        System.out.println("n_pub =" + p.n_pub);
        System.out.println("n_pub =" + p.n_pub);
    }
}
