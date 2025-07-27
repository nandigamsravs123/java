
//class Adder {//method overloading
   // static int add(int a, int b) {
      //  return a + b;
   // }

   // static double add(double a, double b) {
     //   return a + b;
    //}
//}

//overiding


class Animal {
    public void displayInfo() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I bark");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal d1 = new Dog();  
        d1.displayInfo();       
    }
}


