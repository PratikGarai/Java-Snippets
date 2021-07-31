import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySort {

    public static Scanner in = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("Enter the number of elements : ");
        int n = in.nextInt();
        System.err.println("Enter the elements of the array : ");
        Integer[] arr = getIntegers(n);
        System.out.println();
        printArray(arr);
        System.out.println("Sorting...");
        sortArray(arr);
        printArray(arr);
    }

    public static Integer[] getIntegers(int n){
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void sortArray(Integer[] arr){
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr.length-i-1;j++)
        //     {
        //         if(arr[j]<arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        Arrays.sort(arr, (a, b) -> (b-a) );
    }

    public static void printArray(Integer[] arr) {
        System.out.print("The values in the array are : ");
        for(Integer i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
