package onlyfun.caterpillar;
 
public class ForNameDemoV3 {
    public static void main(String[] args) { 
        try {
            System.out.println("���JTestClass2");
            ClassLoader loader = ForNameDemoV3.class.getClassLoader();
            Class c = loader.loadClass("onlyfun.caterpillar.TestClass2");

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