import java.io.*; 

public class BufferedReaderDemo { 
    public static void main(String[] args) throws IOException { 
        BufferedReader bufferedReader = 
                          new BufferedReader(
                             new InputStreamReader(System.in)); 

        System.out.print("�п�J�@�C��r�A�i�]�A�ť�: "); 
        String text = bufferedReader.readLine(); 
        System.out.println("�z��J����r: " + text); 
    } 
}