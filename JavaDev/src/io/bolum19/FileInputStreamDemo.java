package io.bolum19;

import java.io.*;
/**
 * Created by bilalsay on 23/03/2017.
 */
public class FileInputStreamDemo {

    public static void main(String args[]) {
        int size;

        try(FileInputStream f = new FileInputStream("src/io/bolum19/FileInputStreamDemo.java")) {

            System.out.println("Total avaibale size: " + (size = f.available()));

            int n = size/40;

            System.out.println("First " + n + " bytes of the file one read() at a time");

            for (int i = 0; i < n; i++)
                System.out.println((char)f.read());

            System.out.println("\nStill available: " + f.available());

            System.out.println("Reading the text " + (n) + " with one read(b[])");

            byte b[] = new byte[n];

            if (f.read(b) != n)
                System.err.println("couldn't read " + n + "bytes");

            System.out.println(new String(b, 0, n));
            System.out.println("\nStill available: " + (size = f.available()));
            System.out.println("Skipping half of remeaning bytes with skip()");
            f.skip(size/2);
            System.out.println("Still available: " + f.available());
            System.out.println("Reading " + (n/2) + "into the end of array");
            if (f.read(b, n/2, n/2) != n/2)
                System.err.println("couldn't read " + n/2 + " bytes");

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nStill available: " + f.available());



        } catch (IOException e) {
            System.out.println("IO Error: " + e);
        }
    }
}
