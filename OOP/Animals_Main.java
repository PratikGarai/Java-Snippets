import Animals.Animal;
import Animals.Dog;
import Animals.Fish;

public class Animals_Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Jim", 1, 1, 4, 5);
        Dog tommy = new Dog("Tommy", 1, 4, 2, 4, 1, 20, "brown");
        Fish nemo = new Fish("Nemo", 1, 1, 2, 2, 2);

        animal.eat();       // Animal
        animal.move();      // Animal
        tommy.eat();        // Dog
        tommy.move();       // Animal 
        nemo.move();        // Fish
    }
}
