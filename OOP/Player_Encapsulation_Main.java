import Player_Encapsulation.EncapsulatedPlayer;
import Player_Encapsulation.OpenPlayer;

public class Player_Encapsulation_Main {
    public static void main(String[] args) {
        OpenPlayer op = new OpenPlayer("Cheater", 20, "Gun");
        EncapsulatedPlayer ob = new EncapsulatedPlayer("FairPlay", 120, "Sword");

        op.takeDamage(10);
        System.out.println("Cheater Health : "+op.getHealth());
        op.health = 200;
        op.takeDamage(20);
        System.out.println("Cheater Health : "+op.getHealth());

        ob.takeDamage(10);
        System.out.println("FairPlay Health : "+ob.getHealth());
        ob.takeDamage(200);
        System.out.println("FairPlay Health : "+ob.getHealth());
    }
}
