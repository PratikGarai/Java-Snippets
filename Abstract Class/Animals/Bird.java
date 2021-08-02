package Animals;

public abstract class Bird extends Animal {
    
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" pecks");
    }

    @Override
    public void breathe() {
        System.out.println(this.getName()+" takes a fast breath");
    }

    public abstract void fly();
}
