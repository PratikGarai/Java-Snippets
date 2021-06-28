package Animals;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    @Override
    public void move() {
        moveFin();
        moveFin();
        System.out.println("Fish : "+this.getName() + " is swimming!");
    }

    private void moveFin() {
        System.out.println("Moving Fins!");
    }

    public int getGills() {
        return this.gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }

    public int getEyes() {
        return this.eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getFins() {
        return this.fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

}
