public class AdvancedArray { 
    public static void main(String[] args) { 
        int[] arr1 = {1, 2, 3, 4, 5}; 
        int[] tmp1 = arr1; 
        int[] tmp2 = arr1; 
 
        System.out.print("�z�Ltmp1���X�}�C�ȡG");
        for(int i = 0; i < tmp1.length; i++) 
            System.out.print(tmp1[i] + " "); 

        System.out.print("\n�z�Ltmp2���X�}�C�ȡG"); 
        for(int i = 0; i < tmp2.length; i++) 
            System.out.print(tmp2[i] + " "); 
 
        tmp1[2] = 9; 
        System.out.print("\n\n�z�Ltmp1���X�}�C�ȡG");
        for(int i = 0; i < tmp1.length; i++) 
            System.out.print(tmp1[i] + " "); 

        System.out.print("\n�z�Ltmp2���X�}�C�ȡG"); 
        for(int i = 0; i < tmp2.length; i++) 
            System.out.print(tmp2[i] + " "); 
        System.out.println();    
    } 
}