package onlyfun.caterpillar;

public class SomeClass {
    public static void main(String[] args) {
        // �إ�SomeClass���
        SomeClass some = new SomeClass();
        // ���oSomeClass��Class���
        Class c = some.getClass();
        // ���oClassLoader
        ClassLoader loader = c.getClassLoader();
        System.out.println(loader);
        // ���o��ClassLoader
        System.out.println(loader.getParent());
        // �A���o��ClassLoader
        System.out.println(loader.getParent().getParent());
    }
}