import java.util.Scanner;
public class repetitions
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String st = in.nextLine();
		int count = 0;
		int max = 0;
		char c = st.charAt(0);
		int l = st.length();
		for(int i=0;i<l;i++)
		{
			char s = st.charAt(i);
			if(s==c)
			{
				count++;
			}
			else
			{
				c=s;
				if(count>max)
					max = count;
				count=1;
			}
		}
		if(count>max)
			max = count;
		System.out.println(max);
	}
}
