package onlyfun.caterpillar;
 
public class ClassDemo {
    public static void main(String[] args) {
        String name = "caterpillar";
        Class stringClass = name.getClass();
        System.out.println("���O�W�١G" + 
                    stringClass.getName()); 
        System.out.println("�O�_�������G" + 
                    stringClass.isInterface()); 
        System.out.println("�O�_���򥻫��A�G" + 
                    stringClass.isPrimitive()); 
        System.out.println("�O�_���}�C����G" + 
                    stringClass.isArray()); 
        System.out.println("�����O�W�١G" + 
                    stringClass.getSuperclass().getName());
    }
}