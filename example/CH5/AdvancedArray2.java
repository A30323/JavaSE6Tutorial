public class AdvancedArray2 { 
    public static void main(String[] args) { 
        int[] arr1 = {1, 2, 3, 4, 5}; 
        int[] arr2 = {5, 6, 7}; 
        int[] tmp = arr1;
 
        System.out.print("�ϥ�tmp���Xarr1���������G");
        for(int i = 0; i < tmp.length; i++) 
            System.out.print(tmp[i] + " "); 
 
        tmp = arr2; 
        System.out.print("\n�ϥ�tmp���Xarr2���������G");
        for(int i = 0; i < tmp.length; i++) 
            System.out.print(tmp[i] + " "); 
        System.out.println();
    } 
} 