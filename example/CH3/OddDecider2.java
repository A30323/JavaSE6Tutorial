import java.util.Scanner;
 
public class OddDecider2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�п�J�Ʀr: "); 
        int number = scanner.nextInt(); 
        System.out.println("�O�_���_��? " + 
                  ((number&1) != 0 ? '�O' : '�_')); 
    }
}