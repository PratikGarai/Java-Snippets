package Desktop_Composition;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimension;
    

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return this.powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimension() {
        return this.dimension;
    }

    public void setDimension(Dimensions dimension) {
        this.dimension = dimension;
    }
    
}
