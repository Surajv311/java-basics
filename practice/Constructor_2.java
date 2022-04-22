package practice;

// Example for a constructor
public class Constructor_2 {

    int a;
    String b;

    public Constructor_2(int a, String y) {
        this.a = a; // USED this pointer
        b = y; // NOT USED this pointer...
    }

    public static void main(String[] args) {
        Constructor_2 x = new Constructor_2(1989, "Mustang");
        System.out.println(x.a + " " + x.b);
    }
}

/*
final -	The class cannot be inherited by other classes
public class Main {
    final int x = 10;
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
*/

/*
abstract - The class cannot be used to create objects
An abstract method belongs to an abstract class, and it does not have a body.
The body is provided by the subclass
abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
 */