public class ThrowsDemo { 
    public static void main(String[] args) { 
        try { 
            throwsTest(); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("�����ҥ~"); 
        } 
    }

    private static void throwsTest() 
                           throws ArithmeticException { 
        System.out.println("�o�u�O�@�Ӵ���"); 
        // �{���B�z�L�{���]�o�ͨҥ~ 
        throw new ArithmeticException(); 
    } 
}