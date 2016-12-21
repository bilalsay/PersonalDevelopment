package p1;

/**
 * Created by bilalsay on 08.10.2016.
 */
public class Protection {
    int n = 1;
    private int n_pri = 1;
    protected int n_pro = 1;
    public int n_pub = 1;

    public Protection() {
        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri =" + n_pri);
        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pub =" + n_pub);

    }
}
