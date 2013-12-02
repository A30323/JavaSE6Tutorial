package onlyfun.caterpillar;
 
import java.util.*;
 
public class IteratorDemo {
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

        // �ϥ� Iterator ���o����
        Iterator iterator = list.iterator();        
        while(iterator.hasNext()) { // �٦��U�@�Ӥ����ܡH
            // �ϥ� next() ���o�U�@�Ӥ���
            System.out.print(iterator.next() + " ");
        }
        
        System.out.println(); 
    }
}