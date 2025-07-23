
class Animal {
    String name;
    String sound;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Sound: " + sound);
    }
}

class Dog extends Animal {
    void act() {
        System.out.println("The dog is barking!");
    }
}

public class poly {
    public static void main(String[] args) {
        Dog d = new Dog(); // Correct object creation
        d.name = "Dear";
        d.sound = "Bark";
        d.display();       // Call inherited method
        d.act();           // Call Dog-specific method
    }
}





