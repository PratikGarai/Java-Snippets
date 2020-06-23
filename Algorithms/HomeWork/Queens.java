package Algorithms.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Queens
{
    int[] column = new int[8];
    int leftdiagonal[] = new int[15];
    int rightdiagaonal[] = new int[15];
    int ways = 0;
    ArrayList<Integer> obstaclesx;
    ArrayList<Integer> obstaclesy;
    int obs=0;
    void place(int row)
    {
        for(int col=0;col<8;col++)
        {
            if(column[col]==0 && leftdiagonal[col-row+7]==0 && rightdiagaonal[row+col]==0)
            {
                boolean flag = false;
                for(int i =0;i<obs;i++)
                {
                    if(row==obstaclesy.get(i) && col==obstaclesx.get(i))
                        flag = true;
                }
                if(flag)
                    continue;
                column[col]=1;
                leftdiagonal[col-row+7]=1;
                rightdiagaonal[row+col]=1;
                if(row<7)
                    place(row + 1);
                else
                    ways++;
                column[col]=0;
                leftdiagonal[col-row+7]=0;
                rightdiagaonal[row+col]=0;
            }
        }
    }
    void print()
    {
        System.out.println(ways);
    }
    void getObstacles()
    {
        Scanner in = new Scanner(System.in);
        obstaclesx = new ArrayList<Integer>();
        obstaclesy = new ArrayList<Integer>();
        for(int i=0;i<8;i++)
        {
            String s = in.nextLine();
            for(int j=0;j<8;j++)
            {
                if(s.charAt(j)=='*')
                {
                    obs++;
                    obstaclesx.add(j);
                    obstaclesy.add(i);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Queens ob = new Queens();
        ob.getObstacles();
        ob.place(0);
        ob.print();
    }
}