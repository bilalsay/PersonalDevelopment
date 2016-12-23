package assertion;

/**
 * Created by bilalsay on 23.12.2016.
 */
public class AssertDemo {


    static int val = 3;

    // bir  tamsayı döndür
    static int getnum() {
        return val--;
    }


    public static void main(String args[]) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();
            assert n > 0 : "n is negative"; // n sıfır ise geçersiz;

            System.out.println("n is " + n);
        }

    }
}
