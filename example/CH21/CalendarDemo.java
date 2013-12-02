package onlyfun.caterpillar;

import java.util.*;
import static java.util.Calendar.*;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        Locale locale = Locale.getDefault();
       
        System.out.println("�{�b�ɶ��O�G");
        System.out.printf("%s�G%d %n",
           rightNow.getDisplayName(ERA, LONG, locale),
           rightNow.get(YEAR));
        System.out.println(
           rightNow.getDisplayName(MONTH, LONG, locale));
        System.out.printf("%d ��%n", 
           rightNow.get(DAY_OF_MONTH));
        System.out.println(
           rightNow.getDisplayName(DAY_OF_WEEK, LONG, locale));

    }   
}