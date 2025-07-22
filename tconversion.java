public class tconversion {
    public static void main(String[] args) {
        //1. Implicit Type Conversion (Widening)

//Java automatically converts a smaller data type to a larger data type.
//byte → short → int → long → float → double

    /* nt a = 100;
        long b = a;         // int → long
        float c = b;        // long → float
    
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
      }
    }*/
    //datatype variable = (datatype) value;
    // Explicit Type Conversion (Narrowing / Casting)

//You must manually convert a larger type to a smaller type.

          double x = 10.99;
          int y = (int) x;   // double → int (decimal part is lost)
      
          System.out.println("x: " + x);
          System.out.println("y: " + y);
        }
      }
         

    


