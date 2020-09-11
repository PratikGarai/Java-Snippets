public class Reference_Types
{
	public static void main(String args[])
	{
		System.out.println("Trying on integers");
		int a, b;
		a = 6;
		b = a;
		System.out.println("Before, a :"+a+" ,  b :"+b);
		a = 8;
		System.out.println("After, a :"+a+" ,  b :"+b);

		System.out.println("Trying on Strings(objects)");
		String a1 = "Pratik";
		String b1 = a1;
		System.out.println("Before, a :"+a1+" ,  b :"+b1);
		a1 = "Garai";
		System.out.println("After, a :"+a1+" ,  b :"+b1);
	}
}
