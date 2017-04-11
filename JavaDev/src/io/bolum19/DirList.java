package io.bolum19;

import java.io.File;

/**
 * Created by bilalsay on 22/03/2017.
 */
public class DirList {
    public static void main(String args[]) {
        String dirName = "/java";
        File f = new File("/Users/bilalsay/Desktop"+ dirName);

        if (f.isDirectory()) {
            System.out.println("Directory of " + dirName);
            String[] s = f.list();

            for (String sTemporary: s) {
                File fTemporary = new File("/Users/bilalsay/Desktop"+dirName+"/"+sTemporary);

                if (fTemporary.isDirectory()) {
                    System.out.println(sTemporary+" is a directory and has " + fTemporary.list().length + " sub file or directory");
                } else {
                    System.out.println(sTemporary+" is a file");
                }
            }
        } else {
            System.out.println(dirName+" is not a directory");
        }
    }
}
