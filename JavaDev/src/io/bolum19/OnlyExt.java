package io.bolum19;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by bilalsay on 23/03/2017.
 */
public class OnlyExt implements FilenameFilter {

    String ext;
    OnlyExt(String ext) {
        this.ext = ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
