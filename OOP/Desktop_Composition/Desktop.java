package Desktop_Composition;

public class Desktop {

    private Case casing;
    private Monitor monitor;
    private Motherboard motherboard;

    public Desktop(Case casing, Monitor monitor, Motherboard motherboard) {
        this.casing = casing;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getCasing() {
        return this.casing;
    }

    public void setCasing(Case casing) {
        this.casing = casing;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return this.motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    
}
