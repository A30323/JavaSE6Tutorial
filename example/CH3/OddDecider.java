import java.util.Scanner;
 
public class OddDecider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�п�J�Ʀr: "); 
        int number = scanner.nextInt(); 
        System.out.println("�O�_���_��? " + 
                      (number%2 != 0 ? '�O' : '�_')); 
    }
}