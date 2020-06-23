import java.util.Scanner;
public class Increasing_array
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String inp =  in.nextLine();
		String[] s = inp.split(" ");
		long prev = Long.valueOf(s[0]);
		long now = Long.valueOf(s[0]);
		long sum = 0;
		for(int i=1;i<n;i++)
		{
			now = Long.valueOf(s[i]);
			if(now<prev)
			{
				sum += prev-now;
			}
			prev = now;
		}
		System.out.println(sum);
	}
}
