package onlyfun.caterpillar;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for(File root : roots) {
            System.out.printf("%s �`�e�q %d�A�i�ήe�q %d %n", 
               root.getPath(), root.getTotalSpace(), root.getUsableSpace());
        }
    }
}