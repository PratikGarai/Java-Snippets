import java.util.Scanner;
public class Number_Spiral
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		long x,y,sum=0;
		long[] ans  = new long[t];
		for(int i=0;i<t;i++)
		{
			String[] s = in.nextLine().split(" ");
			x = Long.valueOf(s[0]);
			y = Long.valueOf(s[1]);
			long sq = (y>x)?y:x;
			sum = 0;
			sum += (sq-1)*(sq-1);
			sum += (y>x)?((sq%2==0)?x:sq+sq-x):((sq%2==0)?sq+sq-y:y);
			ans[i]=sum;
		}
		for(long k:ans)
		{
			System.out.println(k);
		}
	}
}

