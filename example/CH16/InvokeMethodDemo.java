package onlyfun.caterpillar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodDemo {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            // �ϥεL�Ѽƫغc��k�إߪ���
            Object targetObj = c.newInstance();
            // �]�w�Ѽƫ��A
            Class[] param1 = {String.class};
            // �ھڰѼƫ��A���^��k����
            Method setNameMethod = c.getMethod("setName", param1);
            // �]�w�޼ƭ� 
            Object[] argObjs1 = {"caterpillar"};
            // ���w�޼ƩI�s���w���󤧤�k
            setNameMethod.invoke(targetObj, argObjs1);
            
            
            Class[] param2 = {Integer.TYPE};
            Method setScoreMethod = 
                     c.getMethod("setScore", param2);
            
            Object[] argObjs2 = {new Integer(90)};
            setScoreMethod.invoke(targetObj, argObjs2);
            // ��ܪ���y�z
            System.out.println(targetObj);
            
        } catch (ClassNotFoundException e) {
            System.out.println("�䤣�����O");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("�S���o�Ӥ�k");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}