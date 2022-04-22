package practice;

public class ExceptionHandling_10 {
}

// EXAMPLE OF MULTIPLE CATCH BLOCKS IN TRY-CATCH EXCEPTION
class MultipleCatchBlock3 {

    public static void main(String[] args) {

        try{
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}

//////////////////////////////////////////////////////////////////////////

/*
Java finally block
*Java finally block is always executed whether an exception is handled or not.
Therefore, it contains all the necessary statements that need to be printed
regardless of the exception occurs or not.
*For each try block there can be zero or more catch blocks, but only one finally block.

class TestFinallyBlock {
  public static void main(String args[]){
  try{
//below code do not throw any exception
   int data=25/5;
   System.out.println(data);
  }
//catch won't be executed
  catch(NullPointerException e){
System.out.println(e);
}
//executed regardless of exception occurred or not
 finally {
System.out.println("finally block is always executed");
}

System.out.println("rest of phe code...");
  }
}

 */

//////////////////////////////////////////////////////////////////////////

/*
NESTED TRY-CATCH BLOCK:

//main try block
try
{
    statement 1;
    statement 2;
//try catch block within another try block
    try
    {
        statement 3;
        statement 4;
//try catch block within nested try block
        try
        {
            statement 5;
            statement 6;
     }
        catch(Exception e2)
        {
//exception message
        }

    }
    catch(Exception e1)
    {
//exception message
    }
}
//catch block of parent (outer) try block
catch(Exception e3)
{
//exception message
}

 */