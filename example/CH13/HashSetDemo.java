package onlyfun.caterpillar;
 
import java.util.*;
 
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        
        set.add("caterpillar");
        set.add("momor");
        set.add("bush");
        // �G�N�[�J���Ъ�����
        set.add("caterpillar");
        
        // �ϥ� Iterator ��ܪ���
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }        
        System.out.println(); 

        set.remove("bush");
        // �ϥ� enhanced for loop ��ܪ���
        for(String name : set) {
            System.out.print(name + " ");
        }
        System.out.println(); 
    }
}