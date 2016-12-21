

package mainpackage;


public class FirstClass {
    public static void main(String args[]) {
        BiteConverter BC = new BiteConverter("100010");
        System.out.println(BC.convertToDecimal() + "----"+ Builder.BUILD2);

    }
    public enum Builder {
        BUILD1, BUILD2, BUILD3;
        public String toString() {
            switch (this) {
                case BUILD1:
                    return "Bilal say";
                case BUILD2:
                    return "İbrahim say";
                case BUILD3:
                    return "Fethullah say";
                default:
                    return "Fatma say";
            }
        }
    }
}
