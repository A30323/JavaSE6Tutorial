public class GcTest { 
    private String name; 
 
    public GcTest(String name) { 
        this.name = name; 
        System.out.println(name + "�إ�"); 
    } 
 
    // ����^���e���� 
    protected void finalize() { 
        System.out.println(name + "�Q�^��"); 
    } 
}