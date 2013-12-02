package onlyfun.caterpillar;
 
import java.util.*;
 
enum Action {TURN_LEFT, TURN_RIGHT, SHOOT}
 
public class EnumMapDemo2 {
    public static void main(String[] args) {
        Map<Action, String> map = 
          new EnumMap<Action, String>(Action.class);
        
        map.put(Action.SHOOT, "�g��");        
        map.put(Action.TURN_RIGHT, "�V�k��");
        map.put(Action.TURN_LEFT, "�V����");
        
        for(String value : map.values( )) {
            System.out.println(value);
        }
    }
}