package io.bolum19;

import java.io.ByteArrayInputStream;

/**
 * Created by bilalsay on 26/03/2017.
 */
public class ByteArrayInputStreamDemo {

    public static void main(String args[]) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";

        byte[] b = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
    }
}