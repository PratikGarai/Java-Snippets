package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

/*
There are infinite coins from 'r' countries. Take 'n' coins
such that there is atleast 1 coin of each country.
Sol.. Positive integral solutions.
 */
@SuppressWarnings("SpellCheckingInspection")
public class Coins_and_Countries {
    public static void main(String[] args)
    {
        Coins_and_Countries ob = new Coins_and_Countries();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of coins");
        int n = in.nextInt();
        System.out.println("Enter the no of countries");
        int r = in.nextInt();
        int[] a = new int[r];

        //making all 1 atleast
        Arrays.fill(a,1);

        int[] copy = Arrays.copyOf(a,a.length);

        for(int i=0;i<=r-1;i++) {   //element in consideration
            copy[i] +=n-r;
            ob.printarray(copy);

            for(int j=1;j<n-r;j++) {   //what to add
                copy[i] -=j;

                for(int k=i+1;k<=r-1;k++) {   //whom to add
                    copy[k] +=j;
                    ob.printarray(copy);
                    copy[k] -=j;
                }
                copy[i] +=j;
            }

            copy = Arrays.copyOf(a,a.length);
        }



    }
    private void printarray(int[] a)
    {
        int c=65;
        for(int i=0;i<a.length;i++) {
            for (int j = 1; j <= a[i]; j++) {
                System.out.print((char)c+"\t");
            }
            c++;
        }
        System.out.println();
    }
}
