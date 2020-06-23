package Interface;

import java.util.Arrays;

public class DynStack implements IntStack {
    private int[] stack;
    private int top;
    DynStack(int n)
    {
        stack = new int[n];
        top = -1;
    }
    public  void push(int n)
    {
        if(top==stack.length-1)
        {
            int[] temp = new int[stack.length*2];
            for(int i=0;i<stack.length;i++) temp[i] = stack[i];
            stack = Arrays.copyOf(temp,temp.length);
            stack[++top] = n;
        }
        else
            stack[++top] = n;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack empty");
            return 0;
        } else
            return stack[top--];
    }
}
