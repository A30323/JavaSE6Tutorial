public class CharAtString { 
    public static void main(String[] args) { 
        String text = "One's left brain has nothing right.\n" 
                 + "One's right brain has nothing left.\n"; 
 
        System.out.println("�r�ꤺ�e: "); 
        for(int i = 0; i < text.length(); i++) 
            System.out.print(text.charAt(i)); 

        System.out.println("\n�Ĥ@��left: " + 
                              text.indexOf("left")); 
        System.out.println("�̫�@��left: " + 
                              text.lastIndexOf("left")); 
 
        char[] charArr = text.toCharArray(); 
        System.out.println("\n�r��Array���e: "); 
        for(int i = 0; i < charArr.length; i++) 
            System.out.print(charArr[i]); 
    } 
}