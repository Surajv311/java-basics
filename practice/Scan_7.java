package practice;

//public class Scan_7 {
//}

import java.util.Scanner;

class Main5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Scanner object ...

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}