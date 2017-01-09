package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by bilalsay on 22.12.2016.
 */
public class ShowFile {

    public static void main(String args[]) throws IOException {

        int i;
       // FileInputStream fileInputStream = null;

        if (args.length != 1) {
            System.out.println("Usage: IOFile.ShowFile filename");
            return;
        }
        /* Bu try kullanımı, try-with-resource kullanımı
        *   Açılan bir dosyayı otomatik olarak kapatmaya yarar
        * */
        try (FileInputStream fileInputStream = new FileInputStream(args[0])){
            /*  Bu tanımlamada fileInputStream örtülü olarak final tanımlanmıştır, daha sonra farklı değerler atanamaz*/
            do {
                i = fileInputStream.read();
                if (i != -1)
                    System.out.println((char) i);
            } while(i != -1);

        }  catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("An ıo error occured");
        }
    }
}
