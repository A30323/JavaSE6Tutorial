package onlyfun.caterpillar;
 
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeInstanceDemo2 {
    public static void main(String[] args) {
        // ���o�ثe�ɶ�
        Date date = new Date(); 

        // en: �^�y�t US: ����
        Locale locale = new Locale("en", "US");

        // ²�u��T�榡
        DateFormat shortFormat = 
           DateFormat.getDateTimeInstance( 
              DateFormat.SHORT, DateFormat.SHORT, locale); 
        // ������T�榡
        DateFormat mediumFormat = 
           DateFormat.getDateTimeInstance( 
              DateFormat.MEDIUM, DateFormat.MEDIUM, locale); 
        // ����T�榡
        DateFormat longFormat = 
           DateFormat.getDateTimeInstance( 
              DateFormat.LONG, DateFormat.LONG, locale); 
        // �ԲӸ�T�榡
        DateFormat fullFormat = 
           DateFormat.getDateTimeInstance( 
                DateFormat.FULL, DateFormat.FULL, locale); 

        System.out.println("short format: " + 
                      shortFormat.format(date)); 
        System.out.println("media format: " + 
                      mediumFormat.format(date)); 
        System.out.println("long format: " + 
                      longFormat.format(date)); 
        System.out.println("full format: " + 
                      fullFormat.format(date)); 
    }
}