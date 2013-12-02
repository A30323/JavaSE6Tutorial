package onlyfun.caterpillar;
 
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
 
public class NewInstanceDemo2 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            
            // ���w�Ѽƫ��A
            Class[] params = new Class[2];
            // �Ĥ@�ӰѼƬOString
            params[0] = String.class;
            // �ĤG�ӰѼƬOint
            params[1] = Integer.TYPE;

            // ���o�����ѼƦC���غc��k            
            Constructor constructor = 
                             c.getConstructor(params);
            
            // ���w�޼Ƥ��e
            Object[] argObjs = new Object[2];
            argObjs[0] = "caterpillar";
            argObjs[1] = new Integer(90);
            
            // ���w�޼ƨù�Ҥ�
            Object obj = constructor.newInstance(argObjs);
            // �I�stoString()���[�ݴy�z
            System.out.println(obj);
 
        } catch (ClassNotFoundException e) {
            System.out.println("�䤣�����O");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("�S���ҫ��w����k");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}