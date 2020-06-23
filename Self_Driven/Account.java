package Self_Driven;

import java.util.Scanner;

public class Account extends Bank{
        private Scanner in = new Scanner(System.in);
        private double amt;
        private Account(String n, long a, double am)
        {
        super(n,a,am);
        amt = am;
        }
        private void deposit()
        {
        System.out.println("Enter the amount to deposit");
        double z = in.nextDouble();
        amt+= z;
        }
        private void withdraw()
        {
        System.out.println("Enter the amount to withdraw");
        double z = in.nextDouble();
        if(z>amt)
        System.out.println("Overdraft!!!");
        else
        amt-=z;
        }
        void display()
        {
        super.display();
        System.out.println("Amount : "+amt);
        }
        private void working()
        {
        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println("Enter 1 to deposit");
            System.out.println("Enter 2 to withdraw");
            System.out.println("Enter 3 to display details");
            System.out.println("Enter 0 to end");
            int i= in.nextInt();
            System.out.println();
            if(i==0)
                break;
            switch(i)
            {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                display();
                break;
            default:
                System.out.println("Invalid choice!!!");
        }
        }
        }

        public static void main(String[] args)
        {
            Account ob = new Account("Pratik",1001011000,5000.0);
            ob.working();
            System.out.println();
            System.out.println();
            ob.display();
        }
}