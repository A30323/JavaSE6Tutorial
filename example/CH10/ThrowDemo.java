public class ThrowDemo { 
    public static void main(String[] args) { 
        try {
            double data = 100 / 0.0;
            System.out.println("�B�I�ư��H�s�G" + data); 
            if(String.valueOf(data).equals("Infinity")) 
                throw new ArithmeticException("���s�ҥ~");
        } 
        catch(ArithmeticException e) { 
            System.out.println(e); 
        } 
    } 
}
 