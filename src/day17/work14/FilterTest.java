package day17.work14;

import java.io.File;
import java.io.FileFilter;

public class FilterTest implements FileFilter {
    @Override
    public boolean accept(File pathname) {
            return pathname.getName().endsWith(".java");
    }
}
