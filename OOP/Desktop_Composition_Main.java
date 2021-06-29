import Desktop_Composition.Case;
import Desktop_Composition.Desktop;
import Desktop_Composition.Dimensions;
import Desktop_Composition.Monitor;
import Desktop_Composition.Motherboard;
import Desktop_Composition.Resolution;

public class Desktop_Composition_Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case casing = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1400));
        Motherboard mboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.00");

        Desktop desktop = new Desktop(casing, monitor, mboard);
        desktop.getMonitor().drawPixelAt(1500, 1200, "red");
        desktop.getMotherboard().loadProgram("Linux 1.4");
    }
}