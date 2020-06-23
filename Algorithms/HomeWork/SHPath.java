package Algorithms.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class SHPath
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i=0;i<s;i++)
        {
            int n = in.nextInt();
            ArrayList<Integer>[] graph = new ArrayList[n];
            ArrayList<String> names = new ArrayList<String>();
            int[][] weights = new int[n][n];
            for(int j=0;j<n;j++)
            {
                graph[j] = new ArrayList<Integer>();
            }
            for(int j=0;j<n;j++)
            {
                names.add(in.next());
                int p = in.nextInt();
                in.nextLine();
                for (int k = 0; k < p; k++)
                {
                    String[] nr = in.nextLine().split(" ");
                    int target = Integer.valueOf(nr[0]);
                    int costnr = Integer.valueOf(nr[1]);
                    graph[target - 1].add(j);
                    graph[j].add(target - 1);
                    weights[target - 1][j] = costnr;
                    weights[j][target - 1] = costnr;
                }
            }
            int r = in.nextInt();
            String[] tests = new String[r];
            in.nextLine();
            for(int k=0;k<r;k++)
            {
                String[] name12 = in.nextLine().split(" ");
                String name1 = name12[0];
                String name2 = name12[1];
                int start = names.indexOf(name1);
                int end = names.indexOf(name2);
                int[] curr_dist = new int[n];
                for(int i2=0;i2<n;i2++)
                {
                    curr_dist[i2] = Integer.MAX_VALUE;
                }
                curr_dist[start]= 0 ;
                int[] check = new int[n];
                int counter = 0;
                while(counter!=n)
                {
                    int min = Integer.MAX_VALUE;
                    int vertex = start;
                    for(int i2=0;i2<n;i2++)
                    {
                        if(curr_dist[i2]<min && check[i2]==0)
                        {
                            vertex = i2;
                            min  = curr_dist[i2];
                        }
                    }
                    check[vertex] = 1;
                    counter++;
                    if(vertex==end)
                        break;
                    for(int u: graph[vertex])
                    {
                        if(check[u]==0)
                        {
                            if(curr_dist[u]>curr_dist[vertex]+weights[u][vertex])
                                curr_dist[u] = curr_dist[vertex] + weights[u][vertex];
                        }
                    }
                }
                results.add(curr_dist[end]);
            }
            in.nextLine();
        }
        for(int k : results)
            System.out.println(k);
    }
}
