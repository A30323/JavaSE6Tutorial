package onlyfun.caterpillar;
 
public class ForNameDemoV2 {
    public static void main(String[] args) { 
        try {
            System.out.println("���JTestClass2");
            Class c = Class.forName(
                         "onlyfun.caterpillar.TestClass2", 
                         false, 
                         Thread.currentThread().getContextClassLoader());

            System.out.println("�ϥ�TestClass2�ŧi�ѦҦW��");
            TestClass2 test = null;

            System.out.println("�ϥ�TestClass2�إߪ���");                        
            test = new TestClass2();
        }
        catch(ClassNotFoundException e) {
            System.out.println("�䤣����w�����O");
        }
    }
}