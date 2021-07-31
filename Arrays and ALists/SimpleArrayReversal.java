import java.util.Scanner;

public class SimpleArrayReversal {

    public static Scanner in = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("Enter the number of elements : ");
        int n = in.nextInt();
        System.err.println("Enter the elements of the array : ");
        int[] arr = getIntegers(n);
        System.out.println();
        printArray(arr);
        System.out.println("Reversing...");
        reverseArray(arr);
        printArray(arr);
    }

    public static int[] getIntegers(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void reverseArray(int[] arr){
        int l = arr.length;
        for(int i=0;i<(int)(l/2);i++)
        {
            int temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("The values in the array are : ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
