package Animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" is eating");
    }

    @Override
    public void breathe() {
        System.out.println(this.getName()+" breathes");
    }

    public static void main(String[] args) {
        Dog tom = new Dog("Tom");
        System.out.println("Dog name : "+tom.getName());
        tom.eat();
        tom.breathe();
    }
}
