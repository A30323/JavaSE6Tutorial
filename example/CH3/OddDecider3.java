import java.util.Scanner;
 
public class OddDecider3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("�п�J�Ʀr: "); 
        int input = scanner.nextInt();
        int remain = input % 2; // �D�� 2 ���l��
 
        if(remain == 1) // �p�G�l�Ƭ�1
            System.out.println(input + "���_��"); 
        else 
            System.out.println(input + "������"); 
    }
}