package Animals;

public class Parrot extends Bird {
    
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly(){
        System.out.println(this.getName()+" hops from one branch to another");
    }

    public static void main(String[] args) {
        Parrot tweety = new Parrot("Tweety");
        tweety.eat();
        tweety.breathe();
        tweety.fly();
    }
}
