package practice;



public class Inheritance_4 {
}


class Sound {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Sound {
    private String modelName = "Mustang";
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

/*
If you don't want other classes to inherit from a class, use the final keyword

final class Vehicle {
  ...
}

 */