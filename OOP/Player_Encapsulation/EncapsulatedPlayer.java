package Player_Encapsulation;

public class EncapsulatedPlayer {

    public String name;
    private int health = 100;
    public String weapon;


    public EncapsulatedPlayer(String name, int health, String weapon) {
        this.name = name;

        if(this.health>0 && this.health<=200)
            this.health = health;

        this.weapon = weapon;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if(this.health<=0) {
            System.out.println("Player Fainted");
            this.health = 0;
        }
    }

    public int getHealth() {
        return health;
    }

}
