package Interface;

public class Stack_Demo {
    public static void main(String[] args)
    {
        IntStack st;
        FixedStack fob = new FixedStack(10);
        DynStack dob = new DynStack(6);

        st = fob;
        for(int i=0;i<10;i++)
        {
            st.push(i);
        }

        st=dob;
        for(int i=0;i<10;i++)
        {
            st.push(i*2);
        }

        System.out.println("Contents of fob");
        st = fob;
        for(int i=0;i<10;i++)
            System.out.println(st.pop());

        System.out.println();
        System.out.println("Contents of dob");
        st=dob;
        for(int i=0;i<10;i++)
                System.out.println(st.pop());
    }
}
