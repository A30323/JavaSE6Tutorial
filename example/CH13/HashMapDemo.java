package onlyfun.caterpillar;
 
import java.util.*;
 
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = 
                        new HashMap<String, String>();
        String key1 = "caterpillar";
        String key2 = "justin";

        map.put(key1, "caterpillar ���T��");
        map.put(key2, "justin ���T��");
        
        System.out.println(map.get(key1));
        System.out.println(map.get(key2));
    }
}