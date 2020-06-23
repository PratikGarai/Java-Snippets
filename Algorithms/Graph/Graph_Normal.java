package Algorithms.Graph;

import java.util.*;

public class Graph_Normal
{
    public static void main(String[] args)
    {
        Graph_Normal ob = new Graph_Normal();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Vertices (Base : 0)");
        int v = in.nextInt();
        System.out.println("Enter the no. of edges ");
        int n = in.nextInt();
        in.nextLine();
        ArrayList<Integer>[] g = new ArrayList[v];
        for(int i=0;i<v;i++)
        {
            g[i] = new ArrayList<>();
        }
        boolean weighted = false;
        int[][] weights = new int[v][v];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+"th edge (Weights with a space)");
            String[] s = in.nextLine().split(" ");
            int a = Integer.valueOf(s[0]);
            int b = Integer.valueOf(s[1]);
            if(s.length==3)
            {
                weighted = true;
                int c = Integer.valueOf(s[2]);
                weights[a][b] = c;
                weights[b][a] = c;
            }
            g[a].add(b);
            g[b].add(a);
        }
        ob.print_graph(g,v);
        System.out.println();
        System.out.println("BFS :");
        ob.BFS(g,v);
        System.out.println();
        System.out.println("DFS :");
        ob.DFS(g,v);
        System.out.println();
        System.out.println("Shortest path from 0");
        if(weighted)
        {
            ob.ShortestPath(g,weights,0,v);
        }
        else
            {
            ob.ShortestPath(g, 0, v);
        }
    }
    void print_graph(ArrayList<Integer>[] g, int v)
    {
        for(int i=0;i<v;i++)
        {
            System.out.println(i+" - " + g[i]);
        }
    }

    void BFS(ArrayList<Integer>[] graph, int v)
    {
        int[] visited = new int[v];
        Queue<Integer> q = new LinkedList<Integer>();
        int counter= 0;
        int start = 0;
        while(counter!=v)
        {
            ArrayList<Integer> path = new ArrayList<Integer>();
            for(int i = 0;i<v;i++)    //find start of path
            {
                if(visited[i]==0)
                {
                    start = i;
                    break;
                }
            }
            q.add(start);
            visited[start] = 1;
            counter++;
            path.add(start);
            while(!q.isEmpty())
            {
                int j = q.poll();
                for(int k: graph[j])
                {
                    if(visited[k]==0)
                    {
                        visited[k]=1;
                        path.add(k);
                        counter++;
                        q.add(k);
                    }
                }
            }
            System.out.println(path);
        }
    }

    void DFS(ArrayList<Integer>[] graph,int v)
    {
        int counter = 0;
        int[]  visited = new int[v];
        Stack<Integer> st = new Stack<Integer>();
        int start = 0;
        while(counter!=v)
        {
            ArrayList<Integer> path = new ArrayList<Integer>();
            for(int i=0;i<v;i++)
            {
                if(visited[i]==0)
                {
                    start = i;
                    break;
                }
            }
            st.push(start);
            while(!st.isEmpty())
            {
                int vertix = st.pop();
                if(visited[vertix]==0)
                {
                    visited[vertix]= 1;
                    counter++;
                    path.add(vertix);
                    for(int k: graph[vertix])
                    {
                        if(visited[k]==0)
                        {
                            st.push(k);
                        }
                    }
                }
            }
            System.out.println(path);
        }
    }

    void ShortestPath(ArrayList<Integer>[] g , int start, int v)
    {
        int[] curr_Dist = new int[v];
        for(int i=0;i<v;i++)
        {
            curr_Dist[i] = Integer.MAX_VALUE;
        }
        curr_Dist[start] = 0;
        int[] check = new int[v];   //0=all present
        int counter = 0;
        curr_Dist[0] = 0;
        while(counter!=v)
        {
            int min = Integer.MAX_VALUE;
            int vertex=0;
            for(int i=0;i<v;i++)
            {
                if(check[i]==0 && curr_Dist[i]<min)
                {
                    vertex = i;
                    break;
                }
            }
            check[vertex] = 1;
            counter++;
            for(int k: g[vertex])
            {
                if(check[k]==0)
                {
                    if(curr_Dist[k]>curr_Dist[vertex]+1)
                        curr_Dist[k] = curr_Dist[vertex] + 1;
                }
            }
        }
        for(int k:curr_Dist)
            System.out.print(k+"  ");
        System.out.println();
    }

    void ShortestPath(ArrayList<Integer>[] g ,int[][] weights ,int start, int v)
    {
        int[] curr_Dist = new int[v];
        for(int i=0;i<v;i++)
        {
            curr_Dist[i] = Integer.MAX_VALUE;
        }
        curr_Dist[start] = 0;
        int[] check = new int[v];   //0=all present
        int counter = 0;
        curr_Dist[0] = 0;
        while(counter!=v)
        {
            int min = Integer.MAX_VALUE;
            int vertex=0;
            for(int i=0;i<v;i++)
            {
                if(check[i]==0 && curr_Dist[i]<min)
                {
                    vertex = i;
                    break;
                }
            }
            check[vertex] = 1;
            counter++;
            for(int k: g[vertex])
            {
                if(check[k]==0)
                {
                    if(curr_Dist[k]>curr_Dist[vertex]+weights[vertex][k])
                        curr_Dist[k] = curr_Dist[vertex] + weights[vertex][k];
                }
            }
        }
        for(int k:curr_Dist)
        {
            if(k==Integer.MAX_VALUE)
            {
                System.out.print("Unreachable  ");
            }
            else
            {
                System.out.print(k+"  ");
            }
        }
        System.out.println();
    }
}
