package Self_Driven;

import java.util.Scanner;

public class PalinMake {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PalinMake ob = new PalinMake();
        System.out.println("Enter the sentence");
        String str = in.nextLine();
        int valid = ob.checkValid(str);
        if(valid!=0)
            System.out.println("Sentence Invalid");
        else
            System.out.println("Sentence Valid");
        if(valid==0||valid==2)
            str = str.substring(0,str.length()-1);
        String[] s = str.split(" ");
        String fin = "";
        for (String s1 : s) {
            if (ob.isPalindrome(s1))
                fin = fin + s1.toUpperCase() + " ";
            else
                fin = fin + ob.toPalindrome(s1).toUpperCase() + " ";
        }
        System.out.println("Result :");
        System.out.println(fin);

    }
    private int checkValid(String m)
    {
        int k=0;            //0: perfect sentence
        char c = m.charAt(m.length()-1);
        if(c!='.'&&c!='!'&&c!='?') {
            k = 1;
            return k;       //1: no punctuation error
        }
        int d= m.length()-1;
        for(int i=0;i<d;i++)
        {
            c = m.charAt(i);
            if((c<65||c>90)&&c!=' ')
                    k=2;            //2: case mismatch
        }
        return k;               // error level return
    }
    private boolean isPalindrome(String m)
    {
        boolean validity = true;
        m  = m.toUpperCase();
        for(int i=0;i<m.length()/2;i++)
        {
            if(m.charAt(i)!=m.charAt(m.length()-i-1))
                validity = false;
        }
        return  validity;
    }
    private  String toPalindrome(String m)
    {
        String t = "";
        m = m.toUpperCase();
        boolean flag = true;
        int l =m.length();
        if (l==2)
            flag = false;
        for(int i = m.length()-2;i>=0;i--)
        {
            if(m.charAt(i)!=m.charAt(i+1)&&flag)
            {
                flag = false;
                t += m.charAt(i);
            }
            else if (!flag) {
                t = t + m.charAt(i);
            }
        }

        return m+""+t;
    }
}
