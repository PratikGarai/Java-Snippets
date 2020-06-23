import java.util.Scanner;
public class Two_Sets
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = n*(n+1)/2;
		if(sum%2!=0)
		{
			System.out.println("NO");
		}
		else
		{
			sum = sum/2;
			System.out.println("YES");
			int[] n1 = new int[n];
			int[] n2 = new int[n];
			int l1=-1;
			int l2=-1;
			for(int i=n;i>=1;i--)
			{
				if(i<=sum)
				{
					sum -= i;
					l1++;
					n1[l1] = i;
				}
				else
				{
					l2++;
					n2[l2] = i;
				}
			}
			System.out.println(l1+1);
			for(int i=l1;i>=0;i--)
			{
				System.out.print(n1[i]+" ");
			}
			System.out.println();
			System.out.println(l2+1);
			for(int i=l2;i>=0;i--)
			{
				System.out.print(n2[i]+" ");
			}
			System.out.println();
		}
	}
}
