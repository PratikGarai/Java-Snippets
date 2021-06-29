package Player_Encapsulation;

public class OpenPlayer {
    
    public String name;
    public int health;
    public String weapon;


    public OpenPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if(this.health<=0) {
            System.out.println("Player Fainted");
        }
    }

    public int getHealth() {
        return health;
    }
}
