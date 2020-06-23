package Algorithms;

import java.util.Scanner;

public class Panda_Average {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Panda_Average ob  = new Panda_Average();
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        System.out.println("Enter the elements");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }

        double [] avg = new double[n-1];
        for(int i=1;i<n;i++)
        {
            avg[i-1] = ob.avgdiff(a,i);
        }

        double min= avg[0];
        for(int i=1;i<n-1;i++)
            if(avg[i]<min)
                min = avg[i];

        System.out.println("The minimum difference is "+min);
    }
    private double avgdiff(int[] a, int b)
    {
        double lavg=0 ,ravg = 0;
        for(int i=0;i<b;i++)
            lavg += a[i];
        for(int i=b;i<a.length;i++)
            ravg += a[i];
        lavg /= b;
        ravg /= a.length-b;
        return Math.abs(lavg-ravg);
    }
}
