import Animals.Animal;
import Animals.Dog;

public class Animals_Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Jim", 1, 1, 4, 5);
        Dog tommy = new Dog("Tommy", 1, 4, 2, 4, 1, 20, "brown");

        animal.eat();
        animal.move();
        tommy.eat();
        tommy.move();
    }
}
