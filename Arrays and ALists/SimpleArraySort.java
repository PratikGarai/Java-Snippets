import java.util.Scanner;

public class SimpleArraySort {

    public static Scanner in = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("Enter the number of elements : ");
        int n = in.nextInt();
        System.err.println("Enter the elements of the array : ");
        int[] arr = getIntegers(n);
        System.out.println();
        printArray(arr);
        System.out.println("Sorting...");
        sortArray(arr);
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

    public static void sortArray(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
