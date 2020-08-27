package day17.work14;

import java.io.File;
import java.io.FileFilter;

public class FilterTest implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.getName().endsWith(".java")){
            return true;
        }else {
            return false;
        }
    }
}
