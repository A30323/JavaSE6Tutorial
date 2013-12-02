package onlyfun.caterpillar;
 
import java.util.*;
 
public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = 
                  new HashMap<String, String>();
 
        map.put("justin", "justin ���T��");
        map.put("momor", "momor ���T��");
        map.put("caterpillar", "caterpillar ���T��");
        
        Collection collection = map.values();
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // �ƹ�W�]�i�H�ϥμW�j�� for �j��
        for(String value : map.values()) {
            System.out.println(value);
        }
    }
}