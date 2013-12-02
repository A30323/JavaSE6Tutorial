 package onlyfun.caterpillar;
 
 import java.io.*;
 
 public class StreamWriterDemo {
    public static void main(String[] args) {
        try {
            // �u²�餤��v�|�Ӧr�� GB2312 �s�X
            byte[] sim = {(byte)0xbc, (byte)0xf2, 
                          (byte)0xcc, (byte)0xe5,
                          (byte)0xd6, (byte)0xd0,
                          (byte)0xce, (byte)0xc4};
            // �}�C�@����y�ӷ�
            ByteArrayInputStream byteArrayInputStream = 
                            new ByteArrayInputStream(sim);
            InputStreamReader inputStreamReader = 
                new InputStreamReader( 
                  byteArrayInputStream, "GB2312"); 

            // PrintWriter�ٱ���Writer��ҧ@���޼�
            PrintWriter printWriter = 
               new PrintWriter(
                 new OutputStreamWriter(
                      new FileOutputStream(args[0]), "GB2312")); 

            int in = 0; 

            printWriter.print("PrintWriter: ");
            // �g�J�}�C���e
            while((in = inputStreamReader.read()) != -1)  { 
                printWriter.print((char)in); 
            }
            printWriter.println();

            printWriter.close();
            byteArrayInputStream.reset();

            // PrintStream ����OutputStream��ҧ@���޼�
            PrintStream printStream = 
                new PrintStream(new FileOutputStream(args[0], true), 
                                true, "GB2312");
 
            printStream.print("PrintStream: ");
            // �g�J�}�C���e
            while((in = inputStreamReader.read()) != -1)  { 
                printStream.print((char)in); 
            }
            printStream.println();

            inputStreamReader.close();
            printStream.close();
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("�S�����w�ɮ�");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
 }