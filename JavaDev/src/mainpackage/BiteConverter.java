package mainpackage;

/**
 * Created by bilalsay on 29.09.2016.
 */
class BiteConverter {
    private int binaryValue[];
    private int decimalValue;

    BiteConverter(String value) {
        String [] str = value.split("");
        binaryValue = new int[str.length];
        for (int i = (str.length) - 1, j=0; i >= 0; i--,j++) {
            binaryValue[j] = Integer.parseInt(str[i]);
        }
    }

    BiteConverter(int value) {
        this.decimalValue = value;
    }

    public int convertToDecimal() {
        int total = 0;

        for (int i = 0; i <= binaryValue.length - 1; i++) {
            total += (binaryValue[i] * (ust(2, i)));
        }
        return total;
    }

    private int ust(int taban, int ust) {
        int multiply = 1;

        for (int i = 1; i <= ust;i++) {
            multiply *= taban;
        }
        return multiply;
    }

}
