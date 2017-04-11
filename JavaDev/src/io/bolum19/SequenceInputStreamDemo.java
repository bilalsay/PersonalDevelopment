package io.bolum19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by bilalsay on 27/03/2017.
 */

class InputStreamEnumerator implements Enumeration<FileInputStream> {

    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch(IOException e) {
            return null;
        }
    }
}

public class SequenceInputStreamDemo {

    public static void main(String args[]) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while ((c = input.read()) != -1)
                System.out.print((char) c);
        } catch (NullPointerException e) {
            System.out.println("Error openning file.");
        } catch(IOException e) {
            System.out.println("IO Error: " + e);
        } finally {
            try {
                input.close();
            } catch (IOException  e) {
                System.out.println("Error closing SequenceInputStream");
            }

        }

    }
}
