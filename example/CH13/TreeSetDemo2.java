package onlyfun.caterpillar;
 
import java.util.*;
 
public class TreeSetDemo2 {
    public static void main(String[] args) {
        // �ۭqComparator
        Comparator<String> comparator = 
                      new CustomComparator<String>();
        Set<String> set = 
                      new TreeSet<String>(comparator);
        
        set.add("justin");
        set.add("caterpillar");
        set.add("momor");
        
        // �ϥ� enhanced for loop ��ܪ���
        for(String name : set) {
            System.out.print(name + " ");
        }
        System.out.println(); 
    }
}