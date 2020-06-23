package Algorithms;

import java.util.Scanner;

/*
    To print all permutations of a string in
    lexicographic order
 */
public class String_Permutation {
    public static void main(String[] args)
    {
        String_Permutation ob = new String_Permutation();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.next();
        str = ob.arrange(str);
        ob.printcount(str);
        ob.permute(str, str.length());
    }
    void printcount(String s)
    {
        int count[]  = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            count[(int)c-97]++;
        }
        int result = factorial(s.length());
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            {
                result = result/factorial(count[i]);
            }
        }
        System.out.println(result);
    }
    int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f = f*i;
        }
        return f;
    }
    private String arrange(String s)
    {
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length-1;i++)
        {
            for(int j=0;j<c.length-1-i;j++)
            {
                if(c[j]>c[j+1])
                {
                    char t = c[j];
                    c[j] = c[j+1];
                    c[j+1] = t;
                }
            }
        }
        return String.valueOf(c);
    }
    private void permute(String s,int n)
    {
        if(n==2)
        {
            System.out.println(s);
            s = swap(s,s.length()-2,s.length()-1);
            System.out.println(s);
            s = rswap(s,s.length()-2,s.length()-1);
        }
        else
        {
            for(int i=s.length()-n;i<s.length();i++)
            {
                s = swap(s,s.length()-n, i);
                permute(s,n-1);
                s=rswap(s,s.length()-n, i);
            }
        }
    }
    private String swap(String s, int a, int b)         // circular swap from left to right
    {
        char[] c = s.toCharArray();
        char t = c[b];
        for(int i=b;i>a;i--) {
            c[i] = c[i-1];
        }
        c[a] = t;
        return String.valueOf(c);
    }
    private String rswap(String s, int a, int b)         // circular swap from right to left
    {
        char[] c = s.toCharArray();
        char t = c[a];
        for(int i=a;i<b;i++) {
            c[i] = c[i+1];
        }
        c[b] = t;
        return String.valueOf(c);
    }
}