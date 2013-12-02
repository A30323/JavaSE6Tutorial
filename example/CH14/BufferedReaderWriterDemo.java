package onlyfun.caterpillar;
 
import java.io.*; 
 
public class BufferedReaderWriterDemo { 
    public static void main(String[] args) { 
        try { 
            // �w��System.in��J��y
            BufferedReader bufReader = 
                new BufferedReader(
                      new InputStreamReader(System.in)); 
            // �w��FileWriter�r����X��y
            BufferedWriter bufWriter = 
                new BufferedWriter(new FileWriter(args[0])); 
 
            String input = null; 

            // �CŪ�@��i��@���g�J�ʧ@
            while(!(input = 
                      bufReader.readLine()).equals("quit")) { 
                bufWriter.write(input); 
                // newLine()��k�g�J�P�@�~�t�ά̪ۨ�����r��
                bufWriter.newLine(); 
            } 
 
            bufReader.close(); 
            bufWriter.close(); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("�S�����w�ɮ�");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 