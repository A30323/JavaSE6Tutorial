package onlyfun.caterpillar;
 
import java.util.*;
 
enum Action {TURN_LEFT, TURN_RIGHT, SHOOT}
 
public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Action, String> map = 
          new EnumMap<Action, String>(Action.class);
        
        map.put(Action.TURN_LEFT, "�V����");
        map.put(Action.TURN_RIGHT, "�V�k��");
        map.put(Action.SHOOT, "�g��");
        
        for(Action action : Action.values( ) ) {
            System.out.println(map.get(action));
        }
    }
}