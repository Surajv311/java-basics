package practice;

public class Threads_12 {
}

// CREATE THREAD USING THREAD CLASS
class Multi extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Multi t1=new Multi();
        t1.start();
    }
}

// CREATE THREAD USING RUNNABLE INTERFACE
class Multi3 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Multi3 m1=new Multi3();
        Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }
}

/*
A component of Java that decides which thread to run or execute and which thread to wait is called a thread scheduler in Java.
Eg. First cum First served Algo, Preemptive scheduling Algo ...
/////////////////////////////////////////////////////////////////////

Whenever the Thread.sleep() methods execute, it always halts the execution of the current thread.
Eg.
class TestSleepMethod1 extends Thread{
 public void run(){
  for(int i=1;i<5;i++){
  // the thread will sleep for the 500 milli seconds
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
    System.out.println(i);
  }
 }
 public static void main(String args[]){
  TestSleepMethod1 t1=new TestSleepMethod1();
  TestSleepMethod1 t2=new TestSleepMethod1();

  t1.start();
  t2.start();
 }
}
/////////////////////////////////////////////////////////////////////

We cannot start a thread twice.  If you does so, an IllegalThreadStateException is thrown.
/////////////////////////////////////////////////////////////////////

The join() method in Java is provided by the java.lang.Thread class that permits one thread to wait until the other thread to finish its execution.
/////////////////////////////////////////////////////////////////////

Advantage of Garbage Collection:
It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

/////////////////////////////////////////////////////////////////////

Synchronization in Java is the capability to control the access of multiple threads to any shared resource.

Java Synchronization is better option where we want to allow only one thread to access the shared resource.

Why use Synchronization?:
The synchronization is mainly used to-
To prevent thread interference.
To prevent consistency problem.

Types of Synchronization-
Process Synchronization
Thread Synchronization

/////////////////////////////////////////////////////////////////////
JavaFX is a Java library that is used to develop Desktop applications as well as Rich Internet Applications (RIA). The applications built in JavaFX, can run on multiple platforms including Web, Mobile and Desktops.

Applet is a special type of program that is embedded in the webpage to generate the dynamic content. It runs inside the browser and works at client side.

JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database.
JDBC API uses JDBC drivers to connect with the database. There are four types of JDBC drivers:
-JDBC-ODBC Bridge Driver,
-Native Driver,
-Network Protocol Driver, and
-Thin Driver

/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////
 */