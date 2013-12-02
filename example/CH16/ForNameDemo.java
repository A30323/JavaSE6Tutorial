package onlyfun.caterpillar;
 
public class ForNameDemo {
    public static void main(String[] args) { 
        try {
            Class c = Class.forName(args[0]);
            System.out.println("���O�W�١G" + 
                          c.getName()); 
            System.out.println("�O�_�������G" + 
                             c.isInterface()); 
            System.out.println("�O�_���򥻫��A�G" + 
                             c.isPrimitive()); 
            System.out.println("�O�_���}�C�G" + c.isArray()); 
            System.out.println("�����O�G" + 
                             c.getSuperclass().getName());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("�S�����w���O�W��");
        }
        catch(ClassNotFoundException e) {
            System.out.println("�䤣����w�����O");
        }
    }
}