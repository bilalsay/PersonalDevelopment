package io.bolum19;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by bilalsay on 22/03/2017.
 */
public class DirListOnly {
    public static void main(String args[]) {
        String dirName = "/java";
        File f = new File("/Users/bilalsay/Desktop"+ dirName);
        FilenameFilter only = new OnlyExt("html");

        if (f.isDirectory()) {
            System.out.println("Directory of " + dirName);
            String[] s = f.list(only);

            for (String sTemporary: s) {
                File fTemporary = new File("/Users/bilalsay/Desktop"+dirName+"/"+sTemporary);

                if (fTemporary.isDirectory()) {
                    System.out.println(sTemporary+" is a directory and has " + fTemporary.list(only).length + " sub file or directory");
                } else {
                    System.out.println(sTemporary+" is a file");
                }
            }
        } else {
            System.out.println(dirName+" is not a directory");
        }
    }
}
