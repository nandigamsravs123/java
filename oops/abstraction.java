
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.makeSound(); // Output: Dog barks
        a.sleep();     // Output: Sleeping...
    }
}

