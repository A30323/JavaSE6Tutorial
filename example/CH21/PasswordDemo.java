package onlyfun.caterpillar;

public class PasswordDemo {
    public static void main(String[] args) {
        while(true) {
            System.out.print("��J�W�١G");
            String name = System.console().readLine();

            System.out.print("��J�K�X�G ");
            char[] passwd = System.console().readPassword();
            String password = new String(passwd);

            if("caterpillar".equals(name) &&
               "123456".equals(password)) {
                System.out.println("�w�� caterpillar ");
                break;
            }
            else {
                System.out.printf("%s�A�W�٩αK�X���~�A�Э��s��J�I%n", name);
            }
        }
        
    }
}