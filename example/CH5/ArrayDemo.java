public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[10];
 
        System.out.print("arr ��l��: "); 
        for(int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " "); 
            arr[i] = i; 
        }

        System.out.print("\narr �]�w��: "); 
        for(int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
}