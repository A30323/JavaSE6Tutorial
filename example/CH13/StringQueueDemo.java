package onlyfun.caterpillar;

import java.util.Scanner;

public class StringQueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        StringQueue queue = new StringQueue();
        
        System.out.println("��J�W��(�ϥ�quit����)"); 

        while(true) { 
            System.out.print("# "); 
            String input = scanner.next(); 
 
            if(input.equals("quit"))
                 break; 
            queue.put(input); 
        }
        
        System.out.print("��ܿ�J: ");
        while(!queue.isEmpty()) {
            System.out.print(queue.get() + " ");
        }
        System.out.println();     
    }
}