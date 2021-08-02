package NonStaticNestedClass;

public class GearBoxDriver {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(5);
        GearBox.Gear first = mcLaren.new Gear(1, 1.5);
        GearBox.Gear second = mcLaren.new Gear(2, 2.5);
        GearBox.Gear third = mcLaren.new Gear(3, 3.5);
    }
}
