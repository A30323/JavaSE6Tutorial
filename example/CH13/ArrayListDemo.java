package onlyfun.caterpillar;
 
import java.util.*;
 
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        List<String> list = new ArrayList<String>();
        
        System.out.println("��J�W��(�ϥ�quit����)"); 

        while(true) { 
            System.out.print("# "); 
            String input = scanner.next(); 
 
            if(input.equals("quit"))
                 break; 
            list.add(input); 
        }
        
        System.out.print("��ܿ�J: "); 
        for(int i = 0; i < list.size(); i++) 
            System.out.print(list.get(i) + " "); 
        System.out.println(); 
    }
}