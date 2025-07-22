/*public class Main {
  // Method that adds two numbers
  public static int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    int result = add(5, 3);  // calling the method
    System.out.println("Sum is: " + result);
  }
}
 */
    
 //public class functions {
   // public static void sayHello(String name) {
      //System.out.println("Hello, "+name+"!");
   // }
  
    //public static void main(String[] args) {
     // sayHello("shravya"); // calling the method
  //  }
 // }




 //---> static metod dirctly calls class
 //public class functions{
   // public static void display() {
       // System.out.println("This is a static method.");
     // }
    
     // public static void main(String[] args) {
      //  Example.display(); // call directly
     // }
     
     public class functions {
        public void show() {
          System.out.println("This is a non-static method.");
        }
      
        public static void main(String[] args) {
          functions obj = new functions(); // create object
          obj.show(); // call using object
        }
      }
      