import java.util.Scanner;
import java.util.Arrays;
 
public class ArraysMethodDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int[] arr = {93, 5, 3, 55, 57, 7, 2 ,73, 41, 91};
 
        System.out.print("�Ƨǫe: "); 
        for(int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
 
        Arrays.sort(arr);
 
        System.out.print("�Ƨǫ�: "); 
        for(int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
 
        System.out.print("\n�п�J�j�M��: "); 
        int key = scanner.nextInt();
        int find = -1;
        if((find = Arrays.binarySearch(arr, key)) > -1) {
            System.out.println("���ȩ���� " + 
                                       find + " ��m"); 
        }
        else 
            System.out.println("�䤣����w��"); 
    }
}