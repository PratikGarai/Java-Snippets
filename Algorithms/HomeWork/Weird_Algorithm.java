import java.util.Scanner;
public class Weird_Algorithm
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print(n+" ");
		while(n!=1)
		{
			if(n%2==1)
			{
				n = n*3 + 1;
				System.out.print(n+" ");
			}
			if(n%2==0)
			{
				n = n/2;
				System.out.print(n+" ");
			}
		}
	}
}
