package Interface;

public class FixedStack implements IntStack {
    private int[] stack;
    private int top;
    FixedStack(int n)
    {
        stack = new int[n];
        top = -1;
    }
    public void push(int n)
    {
        if(top==stack.length-1)
            System.out.println("Stack full");
        else
            stack[++top] = n;
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
            return 0;
        }
        else
            return stack[top--];
    }
}
