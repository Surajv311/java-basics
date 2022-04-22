package practice;

//public class Override_Overload_9 {
//}

///////////////////////////////////////////////////////////////////////////////
//Java Method Overriding

//parent class.
class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
//child class
class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    void run(){System.out.println("Bike is running safely");}

     static void main(String args[]){
        Bike2 obj = new Bike2();
        obj.run();
    }
}

/*

* WE CANNOT OVERRIDE STATIC METHOD AND JAVA MAIN METHOD

* Consider a scenario where Bank is a class that provides functionality
to get the rate of interest.
However, the rate of interest varies according to banks.
For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.

class Bank{
int getRateOfInterest(){return 0;}
}
//Creating child classes.
class SBI extends Bank{
int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
int getRateOfInterest(){return 9;}
}
//Test class to create objects and call the methods
class Test2{
public static void main(String args[]){
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
}
}

*/

///////////////////////////////////////////////////////////////////////////////

// Java Method Overloading

/*
There are two ways to overload the method in java:
- By changing number of arguments
- By changing the data type
 */
class OverloadingCalculation1{
    void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}

    public static void main(String args[]){
        OverloadingCalculation1 obj=new OverloadingCalculation1();
        obj.sum(20,20);//now second int literal will be promoted to long
        obj.sum(20,20,20);

    }
}

/*
WE CAN OVERLOAD JAVA MAIN METHOD:

class TestOverloading4{
public static void main(String[] args){System.out.println("main with String[]");}
public static void main(String args){System.out.println("main with String");}
public static void main(){System.out.println("main without args");}
}

 */


///////////////////////////////////////////////////////////////////////////////


