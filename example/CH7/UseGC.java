public class UseGC { 
    public static void main(String[] args) { 
        System.out.println("�Ы�Ctrl + C�פ�{��........"); 
 
        GcTest obj1 = new GcTest("object1"); 
        GcTest obj2 = new GcTest("object2"); 
        GcTest obj3 = new GcTest("object3"); 
 
        // �O�W�٤��ѦҦܪ��� 
        obj1 = null; 
        obj2 = null; 
        obj3 = null; 
 
        // ��ĳ�^������ 
        System.gc(); 
 
        while(true); // ���_����{��
    } 
}