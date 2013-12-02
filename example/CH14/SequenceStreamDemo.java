package onlyfun.caterpillar;

import java.util.*;
import java.io.*;

public class SequenceStreamDemo {
    public static void main(String[] args) {
        try { 
            // args[0]: ���w���Ρ]s�^�γs���]c�^
            switch (args[0].charAt(1)) {
                case 's':
                    // args[1]: �C�Ӥ����ɮת��j�p
                    int size = Integer.parseInt(args[1]);
                    // args[2]: ���w�n�Q���Ϊ��ɮצW��
                    seperate(args[2], size); 
                    break;
                case 'c':
                    // args[1]: ���w�n�Q�զX���ɮ׭Ӽ�
                    int number = Integer.parseInt(args[1]);
                    // args[2]: �զX�᪺�ɮצW��
                    concatenate(args[2], number); 
                    break;
            }
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(
                "Using: java UseSequenceStream [-s/-c]" + 
                " (size/number) filename"); 
            System.out.println("-s: �����ɮ�\n-c: �զX�ɮ�"); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }

    // �����ɮ�
    public static void seperate(String filename, int size) 
                                    throws IOException { 
        FileInputStream fileInputStream = 
            new FileInputStream(new File(filename)); 
        BufferedInputStream bufInputStream = 
            new BufferedInputStream(fileInputStream); 

        byte[] data = new byte[1]; 
        int count = 0;  
        // �q���ɮפj�p�Ϋ��w���Ϊ��j�p
        // �M�w�n���ά��X���ɮ� 
        if(fileInputStream.available() % size == 0) 
            count = fileInputStream.available() / size; 
        else 
            count = fileInputStream.available() / size + 1; 
 
        // �}�l�i�����
        for(int i = 0; i < count; i++) { 
            int num = 0; 
            // ���Ϊ��ɮץ[�W���u�P�s��
            File file = new File(filename + "_" + (i + 1));
            BufferedOutputStream bufOutputStream = 
                new BufferedOutputStream( 
                       new FileOutputStream(file)); 
 
            while(bufInputStream.read(data) != -1) { 
                bufOutputStream.write(data); 
                num++; 
                if(num == size) { // ���ΥX�@���ɮ�
                    bufOutputStream.flush(); 
                    bufOutputStream.close(); 
                    break; 
                } 
            } 
 
            if(num < size) { 
                bufOutputStream.flush(); 
                bufOutputStream.close(); 
            } 
        } 
 
        System.out.println("���ά�" + count + "���ɮ�"); 
    } 

    // �s���ɮ�
    public static void concatenate(String filename, 
                          int number) throws IOException {
        // �����ɮץΪ�List
        List<InputStream> list = 
                new ArrayList<InputStream>();
        
        for(int i = 0; i < number; i++) {
            // �ɮצW���������u�[�W�s��
            File file = new File(filename + "_" + (i+1));
            list.add(i, new FileInputStream(file));
        }
        
        final Iterator<InputStream> iterator = list.iterator();
        
        // SequenceInputStream �ݭn�@��Enumeration����ӫغc
        Enumeration<InputStream> enumation = 
            new Enumeration<InputStream>() {
                public boolean hasMoreElements() {
                    return iterator.hasNext();
                }

                public InputStream nextElement() {
                    return iterator.next();
                }
            };
 
        // �إ�SequenceInputStream
        // �èϥ�BufferedInputStream
        BufferedInputStream bufInputStream = 
            new BufferedInputStream( 
                    new SequenceInputStream(enumation), 
                    8192); 

        BufferedOutputStream bufOutputStream = 
                    new BufferedOutputStream( 
                       new FileOutputStream(filename), 8192); 

        byte[] data = new byte[1]; 
        // Ū���Ҧ��ɮ׸�ƨüg�J�ت��a�ɮ�
        while(bufInputStream.read(data) != -1) 
            bufOutputStream.write(data); 

        bufInputStream.close(); 
        bufOutputStream.flush(); 
        bufOutputStream.close(); 
        System.out.println("�զX" + number + "���ɮ� OK!!"); 
    } 
}