public class CheckArgsDemo {
    public static void main(String[] args) {
        try {
            System.out.printf("���� %s �\��%n", args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("�S�����w�޼�");
            e.printStackTrace();
        }
    }
}