package onlyfun.caterpillar;
 
import java.lang.reflect.Field; 
 
public class AssignFieldDemo {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            Object targetObj = c.newInstance();
            
            Field testInt = c.getField("testInt");
            testInt.setInt(targetObj, 99);
            
            Field testString = c.getField("testString");
            testString.set(targetObj, "caterpillar");
            
            System.out.println(targetObj);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("�S�����w���O");
        } catch (ClassNotFoundException e) {
            System.out.println("�䤣����w�����O");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            System.out.println("�䤣����w����Ʀ���");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }       
    }
}