package onlyfun.caterpillar;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = 
                new TreeMap<String, String>();
        
        map.put("justin", "justin ���T��");
        map.put("momor", "momor ���T��");
        map.put("caterpillar", "caterpillar ���T��");
        
        for(String value : map.values()) {
            System.out.println(value);    
        }
    }
}