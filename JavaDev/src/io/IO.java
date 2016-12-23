package io;

import java.io.*;

/**
 * Created by bilalsay on 21.12.2016.
 */
public class IO {

    public static void main(String args[]) throws IOException {


        /* ---------------------Konsol Çıktısına yazmak */
        /* PrintWriter ile
        // PrintWriter pw = new PrintWriter(System.out: OutputStream, true: Yeni satır temizleme otomatik);
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("This is a string");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
        */

        /* System.out ile
        int b = 'A'; // 65
        System.out.write(b);
        System.out.write('\n');
        */

        /* ---------------------Konsol girdisi okumak
            Konsola eklenen karakter tabanlı bir akış elde etmek için
            byte tabanlı bir akış olan InputStream sınıfının bir subsınıfı olan System.in den gelen byte veriyi
            Reader sınıfının bir subsınıfı olana InputStreamReader aracılığıyla tamponlanmış bir karater tabanlı girdi
            akışına çeviriyoruz

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[100];
        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");

        for (int i = 0; i < 5; i++)
            if((str[i] = br.readLine()).equals("stop")) break;

        System.out.println("\nHere is your file");
        for (int i = 0; i < 5; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }

        /* Konsoldan girilen line yi çıktı akışına vermek
        String str ;
        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");
        do {
            System.out.println(str = br.readLine());
        } while(!str.equals("stop"));
        */
        /* girilen karakter katarını tek tek karakter şeklinde okumak
        char c;
        do {
            System.out.println(c = (char) br.read());
        } while (c != 'q');
        */

    }

}
