package io.bolum19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bilalsay on 25/03/2017.
 */
public class FileOutputStreamDemo {

    public static void main(String args[]) {
        String source = "İman hem nurdur hem kuvvet\n" +
                "Hakiki imanı elde edn adam dünyay meydan okuyabilir\n"+
                "Her nefis ölümü tadacaktır";

        byte[] buf = source.getBytes();

        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
             FileOutputStream f1 = new FileOutputStream("file2.txt");
             FileOutputStream f2 = new FileOutputStream("file3.txt")
            ) {

            // ilk dosyaya yaz
            for (int i = 0; i < buf.length; i +=2)
                f0.write(buf[i]);

            // ikinci dosyaya yaz
            f1.write(buf);

            // üçüncü dosyay yaz
            f2.write(buf, (buf.length - buf.length / 4), buf.length / 4);



        } catch(IOException e) {
            System.out.println("An IO Exception occured");
        }



    }
}
