public class EnumDemo {
    public static void main(String[] args) {
        doAction(Action.TURN_RIGHT);
    }
 
    public static void doAction(Action action) {
        switch(action) { 
            case TURN_LEFT: 
                System.out.println("�V����"); 
                break; 
            case TURN_RIGHT: 
                System.out.println("�V�k��"); 
                break; 
            case SHOOT: 
                System.out.println("�g��"); 
                break; 
        } 
    }
}