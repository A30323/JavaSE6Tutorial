package onlyfun.caterpillar;
 
import java.util.*;

// �w�q�C�|���A
enum FontConstant { Plain, Bold, Italic }
 
public class EnumSetDemo {
    public static void main(String[] args) {
        // �إߦC�|�ȶ��X
        EnumSet<FontConstant> enumSet = 
           EnumSet.of(FontConstant.Plain, 
                      FontConstant.Bold);
        // ��ܶ��X���e
        showEnumSet(enumSet);
        // ��ܸɶ��X���e
        showEnumSet(EnumSet.complementOf(enumSet));
    }

    public static void showEnumSet(
                       EnumSet<FontConstant> enumSet) {
        for(FontConstant constant : enumSet) {
            System.out.println(constant);
        }
        System.out.println();
    }
}