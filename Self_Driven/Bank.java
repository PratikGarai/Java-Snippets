package Self_Driven;

class Bank {
    private String name;
    private long acno;
    private double p;
    Bank(String n, long a, double amt)
    {
        name = n;
        acno = a;
        p = amt;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Account num : "+acno);
        System.out.println("Principal amount : "+p);
    }
}
