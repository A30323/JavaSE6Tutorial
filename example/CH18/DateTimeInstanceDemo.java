package onlyfun.caterpillar;
 
import java.text.DateFormat;
import java.util.Date;

public class DateTimeInstanceDemo {
    public static void main(String[] args) {
        // ���o�ثe�ɶ�
        Date date = new Date(); 

        // ²�u��T�榡
        DateFormat shortFormat = 
            DateFormat.getDateTimeInstance( 
                DateFormat.SHORT, DateFormat.SHORT); 
        // ������T�榡
        DateFormat mediumFormat = 
            DateFormat.getDateTimeInstance( 
                DateFormat.MEDIUM, DateFormat.MEDIUM); 
        // ����T�榡
        DateFormat longFormat = 
            DateFormat.getDateTimeInstance( 
                DateFormat.LONG, DateFormat.LONG); 
        // �ԲӸ�T�榡
        DateFormat fullFormat = 
            DateFormat.getDateTimeInstance( 
                DateFormat.FULL, DateFormat.FULL); 

        System.out.println("²�u��T�榡�G" + 
                      shortFormat.format(date)); 
        System.out.println("������T�榡�G" + 
                      mediumFormat.format(date)); 
        System.out.println("����T�榡�G" + 
                      longFormat.format(date)); 
        System.out.println("�ԲӸ�T�榡�G" + 
                      fullFormat.format(date)); 
    }
}