package onlyfun.caterpillar;

import java.util.ResourceBundle;
import java.text.MessageFormat;

public class MessageFormatDemo {
    public static void main(String[] args) {
        try {
            // �j�wmessages.properties
            ResourceBundle resource = 
                  ResourceBundle.getBundle("messages2");

            String message = resource.getString(
                  "onlyfun.caterpillar.greeting");
            Object[] params = 
                new Object[] {args[0], args[1]};
            MessageFormat formatter = 
                 new MessageFormat(message);

            // ��ܮ榡�ƫ᪺�T��
            System.out.println(formatter.format(params));
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("�S�����w�޼�");
        }
    }
}