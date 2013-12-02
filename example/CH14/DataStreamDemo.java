package onlyfun.caterpillar;
 
import java.io.*;
 
public class DataStreamDemo {
    public static void main(String[] args) {
        Member[] members = {new Member("Justin", 90), 
                              new Member("momor", 95), 
                              new Member("Bush", 88)}; 
        try { 
            DataOutputStream dataOutputStream = 
                new DataOutputStream( 
                         new FileOutputStream(args[0])); 
            
            for(Member member : members) { 
               // �g�JUTF�r��
               dataOutputStream.writeUTF(member.getName()); 
               // �g�Jint���
               dataOutputStream.writeInt(member.getAge()); 
            } 
            // �X�M�Ҧ���Ʀܥت��a
            dataOutputStream.flush(); 
            // ������y
            dataOutputStream.close(); 
            
            DataInputStream dataInputStream = 
                new DataInputStream( 
                         new FileInputStream(args[0])); 
            // Ū�X��ƨ��٭쬰����
            for(int i = 0; i < members.length; i++) { 
                // Ū�XUTF�r��
                String name = dataInputStream.readUTF(); 
                // Ū�Xint���
                int score = dataInputStream.readInt();
                members[i] = new Member(name, score); 
            } 
            // ������y
            dataInputStream.close(); 

            // ����٭�᪺���
            for(Member member : members) { 
               System.out.printf("%s\t%d%n", member.getName(), member.getAge());
            } 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}
 