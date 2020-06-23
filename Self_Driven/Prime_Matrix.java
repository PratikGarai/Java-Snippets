package Self_Driven;

import java.util.Scanner;

public class Prime_Matrix {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter higher limit");
        int h = in.nextInt();
        Prime_Matrix ob = new Prime_Matrix();
        int[] p = ob.Prime_upto(h);
        int l = p.length;

        l = (int)Math.pow(l,0.5);
        int k=0;
        int ra=0;
        int rb=l;
        int ca=0;
        int cb=l;
        int[][] matrix = new int[l][l];

        while(true)
        {
            System.out.println("loop");
            for(int i =ca ;i<cb ;i++)
                matrix[ra][i] = p[k++];
            for(int i =ra+1 ;i<rb ;i++)
                matrix[i][cb-1] = p[k++];
            for(int i =cb-2 ;i>=ca ;i--)
                matrix[rb-1][i] = p[k++];
            for(int i =rb-2 ;i>=ra+1 ;i--)
                matrix[i][ca] = p[k++];

            ra++;
            rb--;
            ca++;
            cb--;
            if(k>=l*l)
                break;
        }

        for(int i =0 ;i<l ;i++) {
            for (int j = 0; j < l; j++)
                System.out.print(matrix[i][j] + "   ");
            System.out.println();
        }

    }

     private int[] Prime_upto(int k) {
        int m=0;
        for(int i = 2;i<=k ;i++)
            if(isPrime(i))  m++;
         int[] a = new int[m];
         m=0;
        for(int i =2 ;i<=k ;i++)
            if(isPrime(i))  a[m++]=i;

            return a;
    }

    private boolean isPrime(int k)
    {
        int c=0;
        for(int i = 1;i<=k ;i++)
            if(k%i==0)  c++;

         return (c==2);
    }
}
