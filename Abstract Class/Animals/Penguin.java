package Animals;

public class Penguin extends Bird {
    
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly(){
        System.out.println(this.getName()+" is no good at flying. Will go swimming instead");
    }

    public static void main(String[] args) {
        Penguin tweety = new Penguin("Oscar");
        tweety.eat();
        tweety.breathe();
        tweety.fly();
    }
}
