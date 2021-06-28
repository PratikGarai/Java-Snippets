package Bank;

public class Account {
    
    private int account_number;
    private float balance;
    private String customer_name;
    private String email;
    private long phone;


    public Account(int account_number, float balance, String customer_name, String email, long phone) {
        this.account_number = account_number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone = phone;

        System.out.println("Account created : " + this.toString());
    }


    @Override
    public String toString() {
        return "{" +
            " account_number='" + getAccount_number() + "'" +
            ", balance='" + getBalance() + "'" +
            ", customer_name='" + getCustomer_name() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            "}";
    }


    public int getAccount_number() {
        return this.account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomer_name() {
        return this.customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void deposit(float amount) {
        this.balance += amount;
        System.out.println(amount + " sucessfully deposited");
    }

    public boolean withdraw(float amount) {
        if(this.balance<amount) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            this.balance -= amount; 
            System.out.println(amount + " successfully withdrawn");
            return true;
        }
    }
}
