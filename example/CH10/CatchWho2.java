public class CatchWho2 { 
    public static void main(String[] args) { 
        try {
            try { 
                throw new ArrayIndexOutOfBoundsException(); 
            } 
            catch(ArithmeticException e) { 
                System.out.println(
                    "ArrayIndexOutOfBoundsException" + 
                    "/���htry-catch"); 
            }
 
            throw new ArithmeticException(); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("�o��ArithmeticException"); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(
                "ArrayIndexOutOfBoundsException" + 
                "/�~�htry-catch"); 
        } 
    } 
}