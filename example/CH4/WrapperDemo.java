public class WrapperDemo {
    public static void main(String[] args) {
        int data1 = 10;
        int data2 = 20;
        
        // �ϥ�Integer�ӥ]��int���
        Integer data1Wrapper = new Integer(data1);
        Integer data2Wrapper = new Integer(data2);
        
        // �������H3
        System.out.println(data1 / 3);
        
        // �ରdouble�ȦA���H3
        System.out.println(data1Wrapper.doubleValue() / 3);

        // �i���ӭȪ����
        System.out.println(data1Wrapper.compareTo(data2Wrapper));
    }
}