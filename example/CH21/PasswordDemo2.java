package onlyfun.caterpillar;

import java.io.Console;

public class PasswordDemo2 {
    public static void main(String[] args) {
        Console console = System.console();
        while(true) {

            String name = console.readLine("[%s] ", "��J�W�١K");

            char[] passwd = console.readPassword("[%s]", "��J�K�X�K");
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