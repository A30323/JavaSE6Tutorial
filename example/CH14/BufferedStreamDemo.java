package onlyfun.caterpillar;
 
import java.io.*;
 
public class BufferedStreamDemo {
    public static void main(String[] args) {
        try {
            byte[] data = new byte[1]; 

            File srcFile = new File(args[0]); 
            File desFile = new File(args[1]); 

            BufferedInputStream bufferedInputStream = 
                new BufferedInputStream(
                         new FileInputStream(srcFile)); 
            BufferedOutputStream bufferedOutputStream = 
                new BufferedOutputStream(
                         new FileOutputStream(desFile));
 
            System.out.println("�ƻs�ɮסG" + 
                             srcFile.length() + "�줸��");

            while(bufferedInputStream.read(data) != -1) { 
                bufferedOutputStream.write(data); 
            }
            
            // �N�w�İϤ�����ƥ����g�X 
            bufferedOutputStream.flush();
 
            // ������y 
            bufferedInputStream.close(); 
            bufferedOutputStream.close(); 

            System.out.println("�ƻs����"); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(
                    "using: java UseFileStream src des"); 
            e.printStackTrace(); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}