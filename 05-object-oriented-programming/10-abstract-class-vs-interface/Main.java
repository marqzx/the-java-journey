
// Abstract Class Example
abstract class Animal {

    // Abstract method
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Interface Example
interface Pet {

    // Abstract method
    void play();

    // Default method
    default void showLove() {
        System.out.println("Pet loves its owner.");
    }
}

// Dog inherits the abstract class and implements the interface
class Dog extends Animal implements Pet {

    // Implementing abstract class method
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }

    // Implementing interface method
    @Override
    public void play() {
        System.out.println("Dog is playing with a ball.");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creating Dog object
        Dog myDog = new Dog();

        // Abstract class methods
        myDog.makeSound();
        myDog.eat();

        // Interface methods
        myDog.play();
        myDog.showLove();
    }
}
