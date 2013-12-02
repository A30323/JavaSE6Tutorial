package onlyfun.caterpillar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        
        System.out.println("�{�b�ɶ��O�G");
        System.out.println("�褸�G" +
                   rightNow.get(Calendar.YEAR));
        System.out.println("��G" + 
                   getChineseMonth(rightNow));
        System.out.println("��G" + 
                   rightNow.get(Calendar.DAY_OF_MONTH));
        System.out.println("�P���G" + 
                   getChineseDayOfWeek(rightNow));
    }
    
    public static String getChineseMonth(Calendar rightNow) {
        String chineseMonth = null;
        
        switch(rightNow.get(Calendar.MONTH)) {
            case Calendar.JANUARY:
                chineseMonth = "�@";
                break;
            case Calendar.FEBRUARY:
                chineseMonth = "�G";
                break;
            case Calendar.MARCH:
                chineseMonth = "�T";
                break;
            case Calendar.APRIL:
                chineseMonth = "�|";
                break;
            case Calendar.MAY:
                chineseMonth = "��";
                break;
            case Calendar.JUNE:
                chineseMonth = "��";
                break;
            case Calendar.JULY:
                chineseMonth = "�C";
                break;
            case Calendar.AUGUST:
                chineseMonth = "�K";
                break;
            case Calendar.SEPTEMBER:
                chineseMonth = "�E";
                break;
            case Calendar.OCTOBER:
                chineseMonth = "�Q";
                break;
            case Calendar.NOVEMBER:
                chineseMonth = "�Q�@";
                break;
            case Calendar.DECEMBER:
                chineseMonth = "�Q�G";
                break;                
        }
        
        return chineseMonth;
    }
    
    public static String getChineseDayOfWeek(
                                 Calendar rightNow) {
        String chineseDayOfWeek = null;
        
        switch(rightNow.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                chineseDayOfWeek = "��";
                break;
            case Calendar.MONDAY:
                chineseDayOfWeek = "�@";
                break;
            case Calendar.TUESDAY:
                chineseDayOfWeek = "�G";
                break;
            case Calendar.WEDNESDAY:
                chineseDayOfWeek = "�T";
                break;
            case Calendar.THURSDAY:
                chineseDayOfWeek = "�|";
                break;
            case Calendar.FRIDAY:
                chineseDayOfWeek = "��";
                break;
            case Calendar.SATURDAY:
                chineseDayOfWeek = "��";
                break;           
        }
        
        return chineseDayOfWeek;
    }
}