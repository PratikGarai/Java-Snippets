class Some_Node
{
	int val;
	Some_Node(int a)
	{
		val = a;
	}

	int get_val()
	{
		return val;
	}

	void set_val(int a)
	{
		val = a;
	}
}

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
		
		System.out.println();
		System.out.println("Trying on Strings(objects)");
		String a1 = "Pratik";
		String b1 = a1;
		System.out.println("Before, a :"+a1+" ,  b :"+b1);
		a1 = "Garai";
		System.out.println("After, a :"+a1+" ,  b :"+b1);
		b1 = "PGarai";
		System.out.println("After, a :"+a1+" ,  b :"+b1);

		System.out.println();
		Some_Node n1 = new Some_Node(12);
		Some_Node n2 = n1;
		System.out.println("Before, a :"+n1.get_val()+"  , b :"+n2.get_val());
		n1.set_val(13);
		System.out.println("After, a :"+n1.get_val()+"  , b :"+n2.get_val());
		n2.set_val(15);
		System.out.println("After, a :"+n1.get_val()+"  , b :"+n2.get_val());
	}
}
