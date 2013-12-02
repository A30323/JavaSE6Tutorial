package onlyfun.caterpillar;
 
import java.io.*; 
 
public class PushbackStreamDemo {
    public static void main(String[] args) {
        try { 
            PushbackInputStream pushbackInputStream = 
                new PushbackInputStream( 
                         new FileInputStream(args[0])); 
            byte[] array = new byte[2]; 
            int tmp = 0; 
            int count = 0; 

            while((count = pushbackInputStream.read(array))
                                             != -1) {
                // ��Ӧ줸���ഫ����� 
                tmp = (short)((array[0] << 8) | 
                      (array[1] & 0xff)); 
                tmp = tmp & 0xFFFF; 
 
                // �P�_�O�_��BIG5�A�p�G�O�h���BIG5����r
                if(tmp >= 0xA440 && tmp < 0xFFFF) {
                    System.out.println("BIG5: " + 
                             new String(array));
                } 
                else { 
                    // �N�ĤG�Ӧ줸�ձ��^��y 
                    pushbackInputStream.unread(array, 1, 1); 
                    // ���ASCII�d�򪺦r��
                    System.out.println("ASCII: " + 
                            (char)array[0]); 
                } 
            } 
 
            pushbackInputStream.close(); 
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("�Ы��w�ɮצW��");
        }
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}