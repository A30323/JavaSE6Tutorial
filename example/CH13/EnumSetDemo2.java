package onlyfun.caterpillar;
 
import java.util.*;
 
enum FontConstant { Plain, Bold, Italic }
 
public class EnumSetDemo2 {
    public static void main(String[] args) {
        // �إ�EnumSet��ҡA��l���e����
        EnumSet<FontConstant> enumSet = 
                    EnumSet.noneOf(FontConstant.class);
        // �[�J�C�|
        enumSet.add(FontConstant.Bold);
        enumSet.add(FontConstant.Italic);
        
        showEnumSet(enumSet);
    }
 
    public static void showEnumSet(
                           EnumSet<FontConstant> enumSet) {
        for(FontConstant constant : enumSet) {
            System.out.println(constant);
        }
        System.out.println();
    }
 }