package Self_Driven;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileSearcher_2
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter search term");
        String t = in.nextLine();
        String dir = "D:/";
        boolean found = false;
        while(!found)
        {
            System.out.println();
            System.out.println("____________________________________________________________________");
            System.out.println("Now in directory : "+dir);
            System.out.println();
            int k=0;
            File ab = new File(dir);
            String[] a = ab.list();
            for(String s: a)
            {
                if(s.indexOf('/')==-1)
                {
                    if(s.equalsIgnoreCase(t))
                    {
                        k++;
                        System.out.println("Possible match "+k+" "+s);
                    }
                }
                else
                {
                    if(s.substring(0,s.lastIndexOf('/')).equalsIgnoreCase(t))
                    {
                        k++;
                        System.out.println("Possible match "+k+" "+s);
                    }
                }
            }
            if(k==0)
            {
                String[] d = new String[a.length+1];
                int z=1;
                System.out.println();
                System.out.println("Sorry, no match found in this directory");
                System.out.println("Enter 1 to list folders, 2 to go to parent directory and anything else to stop searching");
                double b = in.nextDouble();
                if(b!=1&&b!=2)
                    System.exit(0);
                if(b==2)
                {
                    System.out.println("Taking you to parent directory");
                    dir = dir.substring(0,dir.length()-1);
                    dir = dir.substring(0,dir.lastIndexOf('/')+1);
                    continue;
                }
                for(String s:a)
                {
                    File km  = new File(dir+s+"/");
                    if(km.isDirectory())
                    {
                        d[z] = s;
                        z++;
                    }
                }
                if(z==1)
                {
                    System.out.println("Dead end! No folders here");
                    System.out.println("Enter 1 to continue and anything else to stop searching");
                    double j = in.nextDouble();
                    if(j!=1)
                        System.exit(0);
                    else
                    {
                        System.out.println("Taking you to parent directory");
                        dir = dir.substring(0,dir.length()-1);
                        dir = dir.substring(0,dir.lastIndexOf('/')+1);
                    }
                }
                else
                {
                    System.out.println("Folders here");
                    for(int i=1;i<z;i++)
                    {
                        System.out.println(i+" "+d[i]);
                    }
                    boolean fc;
                    int f;
                    do
                    {
                        System.out.println("Enter the folder number to browse");
                        f = in.nextInt();
                        fc = true;
                        if(f<1||f>=z)
                        {
                            System.out.println("Invalid choice! Try again");
                            fc=false;
                        }
                    }while(!fc);
                    dir = dir+ d[f] +"/";
                }
            }
            else
            {
                System.out.println();
                System.out.println(k+ " matches found");
                found = true;
                File sL = new File(dir+"searchLog.txt");
                FileWriter fout = new FileWriter(sL,true);
                Date d1 = new Date();
                String nl = System.getProperty("line.separator");
                fout.write("Search term   : "+t+ nl);
                fout.write("Directory     : "+dir+nl);
                fout.write("Date and Time : "+d1+ nl);
                fout.write("Matches       : "+k+  nl);
                fout.write(nl);
                fout.write("--------------------------------------------------------"+nl);
                fout.write("--------------------------------------------------------"+nl);
                fout.write(nl);
                fout.close();
                System.out.println("Thank You for using FileSearcher 2.0");
            }
        }
    }
}
