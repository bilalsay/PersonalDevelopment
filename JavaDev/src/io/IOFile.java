package io;

import java.io.*;

/**
 * Created by bilalsay on 21.12.2016.
 */
public class IOFile {

    public static void main(String args[]) throws IOException {

        int i;
        FileInputStream fileInputStream = null;

        if (args.length != 1) {
            System.out.println("Usage: IOFile.ShowFile filename");
            return;
        }

        try {
            fileInputStream = new FileInputStream(args[0]);
            do {
                i = fileInputStream.read();
                if (i != -1)
                    System.out.println((char) i);
            } while(i != -1);

        }  catch(IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close(); // dosya yalnız başarılı bir şekilde çaılırsa fileInputStream null dışı bir değer alır
            } catch(IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}