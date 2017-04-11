package io.bolum19;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bilalsay on 26/03/2017.
 */
public class ByteArrayOutputStreamDemo {

    public static void main(String args[]) {
        String s = "İman hem nurdur hem kuvvet.";
        byte[] buf = s.getBytes();

        ByteArrayOutputStream f = new ByteArrayOutputStream();

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("An IO Exception was occured");
        }

        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into Array");
        byte[] b = f.toByteArray();

        for (int i = 0; i < b.length; i++)
            System.out.print((char) b[i]);

        System.out.println("\n To An OutputStream()");

        try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("IO Error " + e);
            return;
        }

        System.out.println("Doing a reset");
        f.reset();

        for (int i = 0; i < 4; i++)
            f.write('B');

        System.out.println(f.toString());
    }
}
