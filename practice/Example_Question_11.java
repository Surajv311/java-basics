package practice;

//public class Example_Question_11 {
//}


import java.util.Scanner;

class Employee {

    int emp_id;
    String name;
    int salary;

    Employee(int a, String b, int c){
        emp_id = a;
        name = b;
        salary = c;
    }

}

public class Example_Question_11 {

    public void filter(Employee[] oj,int n){

        for(int i = 0 ; i < n; i++){

            if(oj[i].salary>10000){
                System.out.println(oj[i].name);
            }
        }

    }

    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Employee[] oj = new Employee[n];

        for(int i = 0 ; i < n ; i++){
            int a = obj.nextInt();
            String b = obj.next();
            int c = obj.nextInt();
            Employee x = new Employee(a,b,c);
            oj[i] = x;

        }
        Example_Question_11 x = new Example_Question_11();
        x.filter(oj,n);

    }
}

