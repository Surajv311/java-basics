package practice;

public class Encapsulation_3{
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
class Main2 {
    public static void main(String[] args) {
        Encapsulation_3 myObj = new Encapsulation_3();
        //myObj.name = "John";  // ERROR
        myObj.setName("John"); // Hence use: Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}

// Outputs "John"