package onlyfun.caterpillar;

import java.util.*;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        CustomComparator<String> comparator = 
                new CustomComparator<String>();
        Map<String, String> map = 
                new TreeMap<String, String>(comparator);
        
        map.put("justin", "justin ���T��");
        map.put("momor", "momor ���T��");
        map.put("caterpillar", "caterpillar ���T��");
        
        for(String value : map.values()) {
            System.out.println(value);    
        }
    }
}