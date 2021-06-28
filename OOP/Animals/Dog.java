package Animals;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog : "+ this.getName() + " is eating!");
    }

    @Override
    public void move() {
        System.out.println("Dog : "+ this.getName() + " is moving!");
    }
    

    public int getEyes() {
        return this.eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return this.tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return this.teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getCoat() {
        return this.coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }
    
}