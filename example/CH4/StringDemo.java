public class StringDemo {
    public static void main(String[] args) {
        String text = "Have a nice day!! :)";
		
        System.out.println("���G" + text);
        
        // �Ǧ^�����j�g���r�ꤺ�e
        System.out.println("�j�g�G" + text.toUpperCase());

        // ��^�����p�g���r�ꤺ�e
        System.out.println("�p�g�G" + text.toLowerCase());

        // �p��r�����
        System.out.println("���סG" + text.length());

        // �Ǧ^���N��r�᪺�r��
        System.out.println("���N�G" + text.replaceAll("nice", "good"));

        // �Ǧ^���w��m�᪺�l�r��
        System.out.println("�l�r��G" + text.substring(5));
    }
}