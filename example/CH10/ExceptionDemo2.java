import java.io.*; 
 
public class ExceptionDemo2 { 
    public static void main(String[] args) { 
        try { 
            throw new ArithmeticException("�ҥ~����"); 
        } 
        catch(ArithmeticException e) { 
            System.out.println(e.toString()); 
        } 
        catch(Exception e) { 
            System.out.println(e.toString()); 
        } 
    } 
}