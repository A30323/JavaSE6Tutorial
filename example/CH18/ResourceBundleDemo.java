package onlyfun.caterpillar;

import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        // �j�wmessages.properties
        ResourceBundle resource = 
                  ResourceBundle.getBundle("messages");
        // ���o�����T��
        System.out.print(resource.getString(
                      "onlyfun.caterpillar.welcome") + "!");
        System.out.println(resource.getString(
                      "onlyfun.caterpillar.name") + "!");
    }
}