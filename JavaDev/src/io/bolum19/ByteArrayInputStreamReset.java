package io.bolum19;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

/**
 * Created by bilalsay on 26/03/2017.
 */
public class ByteArrayInputStreamReset {

    public static void main(String args[]) {
        String s = "abc";
        byte[] b = s.getBytes(Charset.defaultCharset());

        ByteArrayInputStream input = new ByteArrayInputStream(b);

        for (int i = 0; i < 2; i++) {

            int c;
            while((c = input.read()) != -1) {
                if (i == 0)
                    System.out.print((char) c);
                else
                    System.out.print(Character.toUpperCase((char) c));
            }

            System.out.println();
            input.reset();

        }
    }
}
