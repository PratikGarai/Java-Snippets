import java.util.Scanner;
public class Missing_Number
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = n*(n+1)/2;
		in.nextLine();
		String inp = in.nextLine();
		String[] s = inp.split(" ");
		for(String k: s)
		{
			sum = sum - Long.valueOf(k);
		}
		System.out.println(sum);
	}
}
