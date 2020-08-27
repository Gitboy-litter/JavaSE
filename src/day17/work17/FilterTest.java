package day17.work17;

import java.io.File;
import java.io.FileFilter;

public class FilterTest implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.length()<1024*200){
            System.out.println(pathname.getName()+"小于200kb");
            return false;
        }
        return true;
    }
}
