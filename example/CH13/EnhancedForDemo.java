package onlyfun.caterpillar;
 
import java.util.*;
 
public class EnhancedForDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> list = new ArrayList<String>();
        
        System.out.println("��J�W��(��Jquit����)"); 
        while(true) { 
            System.out.print("# "); 
            String input = scanner.next(); 

            if(input.equals("quit"))
                 break; 
            list.add(input); 
        }
        
        // �ϥ�foreach�ӹM�XList��������
        for(String s : list) {
            System.out.print(s + " ");
        }
        
        System.out.println(); 
    }
}