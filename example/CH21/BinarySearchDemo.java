package onlyfun.caterpillar;

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int result = Arrays.binarySearch(arr1, 6, 9, 85);

        if(result > -1) {
            System.out.printf("���� %d �B�����%n", result);
        }
        else {
            System.out.printf("���J�I %d %n", (result + 1) * -1);
        }
    }
}