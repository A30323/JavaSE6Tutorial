package onlyfun.caterpillar;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        try {
            // ���ո��|
            String classPath = args[0];
            // �������O
            String className = args[1];

            URL url1 = new URL(classPath);
            // �إ�ClassLoader
            ClassLoader loader1 = 
                      new URLClassLoader(new URL[] {url1});
            // ���J���w���O
            Class c1 = loader1.loadClass(className);
            // ������O�y�z
            System.out.println(c1);
        
            URL url2 = new URL(classPath);
            ClassLoader loader2 = 
                      new URLClassLoader(new URL[] {url2});
            Class c2 = loader2.loadClass(className);
        
            System.out.println(c2);
        
            System.out.println("c1 �P c1 ���P�@��ҡH" 
                                     + (c1 == c2));
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("�S�����w���O���J���|�P�W��");
        }
        catch(MalformedURLException e) {
            System.out.println("���J���|���~");
        }
        catch(ClassNotFoundException e) {
            System.out.println("�䤣����w�����O");
        }
    }
}