public class AnonymousClassDemo { 
    public static void main(String[] args) { 
        Object obj = 
            new Object() { 
                public String toString() { // ���s�w�qtoString()
                    return "�ΦW���O����"; 
                } 
            }; 

        System.out.println(obj); 
    } 
}