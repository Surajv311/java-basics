package practice;

class Test {

    // public function
    public void tfun1(){
        System.out.println("public function in Test");
    }
    // static function
    public static void tfun2(){
        System.out.println("static function in Test\n");
    }
}

// we can have only 1 public class. We cannot have a static class
// <filename.java> ~ your public class
public class Main {

    // public function
    public void mfun1(){
        System.out.println("public function in Main");
    }// we may also have a private function accessible only by members of same class

    // static function
    static void mfun2(){
        System.out.println("static function in Main\n");
    }

    public static void main(String args[]){ // main function
        // we can't have <public static int main...>

        // calling functions in same class
        Main obj = new Main();

        obj.mfun1(); // function needs object to be called
        mfun2(); // static function can be called without objects

        ////////////////////////////////////////////////////////////////////

        // calling functions in different class

        Test obj2 = new Test();

        obj2.tfun1(); // function needs object to be called

        // TO CALL FUNCTION OF A DIFFERENT CLASS FROM A CLASS, YOU MUST CALL IT VIA CLASS
        Test.tfun2(); // hence tfun2() can't be called, but Test.tfun2() can be called!.

        ////////////////////////////////////////////////////////////////////
        /*
        Recall in C++, how we call functions via objects:

        class Test {
        public:
        int x;
        };

        int main() {
        Test obj;
        obj.x = 120;
        cout << obj.x;

        Test *obj2 = new Test();
        obj2->x = 240;
        cout << obj2->x;
        }
         */
        ////////////////////////////////////////////////////////////////////






    }

}




