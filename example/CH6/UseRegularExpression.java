import java.io.*;
 
public class UseRegularExpression { 
    public static void main(String args[]) 
                              throws IOException { 
        BufferedReader reader = 
            new BufferedReader(
                new InputStreamReader(System.in));
 
        System.out.println("abcdefgabcabc".replaceAll(".bc", "###")); 
 
        String phoneEL = "[0-9]{4}-[0-9]{6}";
        String urlEL = "<a.+href*=*['\"]?.*?['\"]?.*?>";
        String emailEL = "^[_a-z0-9-]+(.[_a-z0-9-]+)*" + 
                         "@[a-z0-9-]+(.[a-z0-9-]+)*$";

        System.out.print("��J������X: "); 
        String input = reader.readLine();
 
        if(input.matches(phoneEL)) 
            System.out.println("�榡���T"); 
        else 
            System.out.println("�榡���~");
 
        System.out.print("��Jhref����: "); 
        input = reader.readLine();
 
        // ����href���� 
        if(input.matches(urlEL))
            System.out.println("�榡���T"); 
        else
            System.out.println("�榡���~");
 
        System.out.print("��J�q�l�l��: "); 
        input = reader.readLine();
 
        // ���ҹq�l�l��榡 
        if(input.matches(emailEL))
            System.out.println("�榡���T"); 
        else
            System.out.println("�榡���~"); 
    } 
}