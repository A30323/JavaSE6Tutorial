package onlyfun.caterpillar;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println("�{�b�ɶ� " 
                      + date.toString());
        System.out.println("��1970/1/1�ܤ����@��� " 
                      + date.getTime());
    }
}