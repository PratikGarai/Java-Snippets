package NonStaticNestedClass;

import java.util.ArrayList;

public class GearBoxPrivy {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;
    
    public GearBoxPrivy(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if(number>0 && number<=maxGears)
            this.gears.add(new Gear(number, ratio));
    }

    public void changeGear(int newGear) {
        if(newGear>=0 && newGear<=gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear "+newGear+" selected");
        } else {
            System.out.println("Grind");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream");
            return 0.0;
        } else {
            return revs*gears.get(currentGear).driveSpeed(revs);
        }
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }        

        public double driveSpeed(int revs) {
            return revs*this.ratio;
        }
    }
}
