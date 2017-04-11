package io.bolum19;

import java.io.File;

/**
 * Created by bilalsay on 22/03/2017.
 */
public class App {

    public static void main(String args[]) {
        File f1 = new File("/Users/bilalsay/Desktop/java/","COPYRIGHT.txt");
        System.out.println("File Name: " + f1.getName());
        System.out.println("Path: " + f1.getPath());
        System.out.println("Abs Path: " + f1.getAbsolutePath());
        System.out.println("Parent: " + f1.getParent());
        System.out.println(f1.exists() ? "exist" : "does not exist");
        System.out.println(f1.canWrite() ? "is writiable" : "is not writeable");
        System.out.println(f1.isDirectory() ? "is diractory" : "is not a diractory");
        System.out.println(f1.isFile() ? "is normal file" : "might be a named pipe");
        System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute");
        System.out.println("File last modified: " + f1.lastModified());
        System.out.println("File size: " + f1.length() + " bytes");

        //f1.renameTo(new File("/Users/bilalsay/Desktop/java/","COPYRIGHT.txt"));
        f1.deleteOnExit();

        System.out.println(f1.isHidden());
    }

}
