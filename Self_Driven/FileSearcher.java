package Self_Driven;

//base directory set to D:
//res= "####.###%%%" denotes to continue searching
import java.util.Scanner;
import java.io.*;
import java.util.Date;
public class FileSearcher
{
    public static void main(String[] args) throws IOException
    {
        FileSearcher ob = new FileSearcher();
        Scanner in = new Scanner(System.in);
        String dir = "D:/";
        boolean found = false;
        System.out.println("Enter the name of file to be searched");
        String nm = in.nextLine();
        do
        {
            File a = new File(dir);
            String lst[] = a.list();
            String res = ob.Searcher(lst,nm);
            if(res=="####.###%%%")
            {
                System.out.println();
                System.out.println("No match found here");
                System.out.println("Enter 1 to continue and 2 to terminate search");
                int choice = in.nextInt();
                in.nextLine();
                if(choice==2)
                    System.exit(0);
                else
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("-----------------------------------------------");
                    System.out.println("List of folders here: ");
                    System.out.println("-----------------------------------------------");
                    for(int i=0;i<lst.length;i++)
                    {
                        File k = new File(dir+lst[i]+"/");
                        if(k.isDirectory())
                            System.out.println(lst[i]);
                    }
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter directory to browse(case match too)");
                    String inp = in.nextLine();
                    dir = dir + inp + "/";
                }
            }
            else
            {
                found = true;
                ob.createLog(dir,nm);
            }
        }while(found==false);
    }
    public String Searcher(String a[], String n)
    {
        Scanner v = new Scanner(System.in);
        int k=0;
        String m[] = new String[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(a[i].lastIndexOf('.')!=-1)       //not a folder
            {
                if(n.equalsIgnoreCase(a[i].substring(0,(a[i].lastIndexOf('.')))))
                {
                    System.out.println("Possible match "+(k+1)+" :");
                    System.out.println(a[i]);
                    m[k] = a[i];
                    k++;
                    System.out.println();
                }
            }
            else if(n.equalsIgnoreCase(a[i]))        //folder
                {
                    System.out.println("Possible match "+(k+1)+" :");
                    System.out.println(a[i]);
                    m[k] = a[i];
                    k++;
                    System.out.println();
                }

        }
        if(k==0)
            return "####.###%%%";
        boolean flag = false;
        int d;
        System.out.println("------------------------------------------");
        do
        {
            System.out.println("If any choice matches, enter match number else enter 0");
            d = v.nextInt();
            if(d>k)
                System.out.println("Invalid match, enter again!");
            else
                flag = true;
        }while(!flag);
        if(d==0)
            return "####.###%%%";      //not possible file name
        else
            return m[d];
    }
    public void createLog(String dir, String nm) throws IOException
    {
        File a = new File(dir+"searchLog.txt");
        FileWriter fout = new FileWriter(a,true);
        Date d1 = new Date();
        String nl = System.getProperty("line.separator");
        fout.write("Search term   : "+nm+ nl);
        fout.write("Directory     : "+dir+nl);
        fout.write("Date and Time : "+d1+ nl);
        fout.write(nl);
        fout.write("--------------------------------------------------------"+nl);
        fout.write("--------------------------------------------------------"+nl);
        fout.write(nl);
        fout.close();
        System.out.println("Thank You for using FileSearcher");
    }
}