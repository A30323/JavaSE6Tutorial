package onlyfun.caterpillar;

import java.lang.reflect.*;

public class SimpleClassViewer {
     public static void main(String[] args) { 
        try {
            Class c = Class.forName(args[0]);
            // ���o�M��N����
            Package p = c.getPackage();
            
            System.out.printf("package %s;%n", p.getName());
            
            // ���o���A�׹��A���Oclass�Binterface
            int m = c.getModifiers();
            
            System.out.print(Modifier.toString(m) + " ");
            // �p�G�O����
            if(Modifier.isInterface(m)) {
                System.out.print("interface ");
            }
            else {
                System.out.print("class ");
            }
            
            System.out.println(c.getName() + " {");

            // ���o�ŧi����Ʀ����N����
            Field[] fields = c.getDeclaredFields();
            for(Field field : fields) {
                // ����v���׹��A���Opublic�Bprotected�Bprivate
                System.out.print("\t" + 
                    Modifier.toString(field.getModifiers()));
                // ��ܫ��A�W��
                System.out.print(" " + 
                    field.getType().getName() + " ");
                // ��ܸ�Ʀ����W��
                System.out.println(field.getName() + ";");
            }

            // ���o�ŧi���غc��k�N����            
            Constructor[] constructors = 
                            c.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                // ����v���׹��A���Opublic�Bprotected�Bprivate
                System.out.print("\t" + 
                     Modifier.toString(
                       constructor.getModifiers()));
                // ��ܫغc��k�W��
                System.out.println(" " + 
                      constructor.getName() + "();");
            }
            // ���o�ŧi����k�����N����             
            Method[] methods = c.getDeclaredMethods();
            for(Method method : methods) {
                // ����v���׹��A���Opublic�Bprotected�Bprivate
                System.out.print("\t" + 
                     Modifier.toString(
                              method.getModifiers()));
                // ��ܪ�^�ȫ��A�W��
                System.out.print(" " + 
                     method.getReturnType().getName() + " ");
                // ��ܤ�k�W��
                System.out.println(method.getName() + "();");
            }
            System.out.println("}");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("�S�����w���O");
        }
        catch(ClassNotFoundException e) {
            System.out.println("�䤣����w���O");
        }
    }
}