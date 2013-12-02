package onlyfun.caterpillar;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<String>();
        
        System.out.println("��J�W��(�ϥ�quit����)"); 

        while(true) { 
            System.out.print("# "); 
            String input = scanner.next(); 
 
            if(input.equals("quit"))
                 break; 
            // offer()�G�[�J�����ܦ�C��
            queue.offer(input); 
        }
        
        System.out.print("��ܿ�J: ");
        String element = null;
        // poll()�G���o�ò��h��C��������
        while((element = queue.poll()) != null) {
            System.out.print(element + " ");
        }
        System.out.println();     
    }
}