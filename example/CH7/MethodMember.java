public class MethodMember {
    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        
        methodDemo.scopeDemo(); // ��data field���|���v�T
        System.out.println(methodDemo.getData());

        methodDemo.setData(100); // ��data field���|���v�T
        System.out.println(methodDemo.getData());
    }
}

class MethodDemo {
    private int data = 10;

    public void scopeDemo() {
        int data = 100;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        data = data; // �o�˼g�O�S�Ϊ�
        // �g�U���o�Ӥ~����
        // this.data = data;
    }
}
