package Self_Driven;

import java.util.Arrays;

public class Referencing_Dereferencing
{
    public static void main(String[] args)
    {
        int[] array1 = {0,1,2,3,4,5};
        int[] array2 = array1;                          //referencing 1->2
        array1[0]= 10;
        System.out.println("Array 1 : "+ Arrays.toString(array1));
        System.out.println("Array 2 : "+ Arrays.toString(array2));

        array2 = Arrays.copyOf(array1, array1.length);                 //referencing cancelled
        System.out.println("Array 1 : "+ Arrays.toString(array1));
        System.out.println("Array 2 : "+ Arrays.toString(array2));

        array1[0] = 15;
        System.out.println("Array 1 : "+ Arrays.toString(array1));
        System.out.println("Array 2 : "+ Arrays.toString(array2));

    }
}
