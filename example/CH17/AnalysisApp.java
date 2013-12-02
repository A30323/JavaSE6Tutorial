package onlyfun.caterpillar;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnalysisApp {
    public static void main(String[] args) 
                               throws NoSuchMethodException {
        Class<SomeClass3> c = SomeClass3.class;

        // �]��SomeAnnotation�Хܩ�doSomething()��k�W
        // �ҥH�n���odoSomething()��k��Method���
        Method method = c.getMethod("doSomething");

        // �p�GSomeAnnotation�s�b����
        if(method.isAnnotationPresent(SomeAnnotation.class)) {
            System.out.println("��� @SomeAnnotation");
            // ���oSomeAnnotation
            SomeAnnotation annotation = 
                 method.getAnnotation(SomeAnnotation.class);
            // ���ovalue������
            System.out.println("\tvalue = " + annotation.value());
            // ���oname������
            System.out.println("\tname = " + annotation.name());
        }
        else {
            System.out.println("�䤣�� @SomeAnnotation");
        }

        // ���odoSomething()��k�W�Ҧ���Annotation
        Annotation[] annotations = method.getAnnotations();
        // ���Annotation�W��
        for(Annotation annotation : annotations) {
            System.out.println("Annotation�W�١G" +
                    annotation.annotationType().getName());
        }
    }
 }