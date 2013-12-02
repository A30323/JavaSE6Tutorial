package onlyfun.caterpillar;
 
import java.io.*;
 
public class StreamReaderWriterDemo {
    public static void main(String[] args) {
        try { 
            FileInputStream fileInputStream = 
                new FileInputStream(args[0]); 
            // ��FileInputStream�[�W�r���B�z�\��
            InputStreamReader inputStreamReader = 
                new InputStreamReader(fileInputStream); 

            FileOutputStream fileOutputStream = 
                new FileOutputStream("backup_" + args[0]); 
            // ��FileOutputStream�[�W�r���B�z�\��
            OutputStreamWriter outputStreamWriter = 
                new OutputStreamWriter(fileOutputStream); 
            
            int ch = 0; 
            // �H�r���覡����ɮפ��e 
            while((ch = inputStreamReader.read()) != -1) { 
                System.out.print((char) ch); 
                outputStreamWriter.write(ch); 
            } 
            System.out.println(); 

            inputStreamReader.close(); 
            outputStreamWriter.close(); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("�S�����w�ɮ�");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}