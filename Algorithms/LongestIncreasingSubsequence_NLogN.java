package Algorithms;

@SuppressWarnings("ALL")
public class LongestIncreasingSubsequence_NLogN {
    public void LIS(int[] X)
    {
        int[] parent = new int[X.length];       //Tracking predecessors of elements of each subsequence
        int[] increasingSub = new int[X.length+1];      //Tracking ends of each increasing subsequence
        int length = 0;

        for(int i=0;i<X.length;i++)
        {
            //Binary Search
            int low=1;
            int mid = 0;
            int high = length;
            while(low<=high)
            {
                mid = (int)Math.ceil((low+high)/2);

                if(X[increasingSub[mid]]<X[i])
                    low = mid+1;
                else
                    high = mid -1;
            }

            int pos = low;
            //update parent/previous for LIS
            parent[i]  = increasingSub[pos-1];
            //replace or append
            increasingSub[pos] = i;

            //update length of longest subsequence
            if(pos>length)
                length = pos;
            System.out.println("i = "+i);
            displayAll(parent,increasingSub,low,length,mid);
        }

        //generate LIS by traversing parent array
        int[] LIS = new int[length];
        int k = increasingSub[length];
        for(int j=length-1;j>=0;j--)
        {
            LIS[j] = X[k];
            k = parent[k];
        }

        for(int i=0;i<length;i++)
        {
            System.out.println(LIS[i]);
        }
    }

    private void displayAll(int[] parent, int[] increasingSub, int low, int length,int mid)
    {
        System.out.println("Parent : ");
        for(int i =0;i<parent.length;i++)
        {
            System.out.print(parent[i]+"\t");
        }
        System.out.println();
        System.out.println("increasingSub : ");
        for(int i =0;i<increasingSub.length;i++)
        {
            System.out.print(increasingSub[i]+"\t");
        }
        System.out.println();
        System.out.println("low = "+low +"\t length = "+length+"\t  mid = "+mid);
    }

    public static void main(String[] args)
    {
        int X[] = {3,1,5,2,6,4,9};
        LongestIncreasingSubsequence_NLogN ob = new LongestIncreasingSubsequence_NLogN();
        ob.LIS(X);
    }
}
