import java.io.*; 
 
public class CheckedExceptionDemo { 
    public static void main(String[] args) { 
        try { 
            BufferedReader buf = new BufferedReader( 
                new InputStreamReader(System.in)); 
            System.out.print("�п�J���: "); 
            int input = Integer.parseInt(buf.readLine()); 
            System.out.println("input x 10 = " + (input*10)); 
        } 
        catch(IOException e) { 
            System.out.println("I/O���~"); 
        } 
        catch(NumberFormatException e) { 
            System.out.println("��J���������"); 
        } 
    } 
}