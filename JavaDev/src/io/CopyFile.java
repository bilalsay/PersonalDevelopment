package io;

import java.io.*;
/**
 * Created by bilalsay on 22.12.2016.
 */
public class CopyFile {

    public static void main(String args[]) {
        int i;
        // Önce kopyalanacak dosya adı ve nereye kopyalanacağı değerinin girilip girilimediğini kontrol edlim
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        /* try-with-resource de birden fazla akış input outpu fark etmeksiszin tanımlanabilir */
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1]);
             FileInputStream finn = new FileInputStream(args[1])){
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while(i != -1);

            do {
                i = finn.read();
                System.out.println((char) i);
            } while(i != -1);

        } catch(IOException e) {
            System.out.println("IO Erorr: " + e);
        }


    }
}
