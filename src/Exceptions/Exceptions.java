package Exceptions;

public class Exceptions {
    /*problems in language are classified as:
    1.Errors
    2.Exceptions.Exceptions

    Exception:
    A recoverable/handleable abnormal condition that occurs during program execution
     Error:
     Serious problem that can't be recoverable
     ex:memory overflow or stack overflow error

     */
    public static void main(String[] args) {
    //Exception
        //int num = 5/0;
        //System.out.println(num); here the coed crashes and then the following code will nevere rn the flow will crashes
        //to get rid of this problem we use exception handling using try-catch block
        //stac trace print karinge
         int a = 20 , b = 0;
        // methodA(a,b);
        try{
            //the risky code goes here
            System.out.println(a/b);
        }catch (ArithmeticException s){
            //preventive / handling code
            System.out.println("Division by zero is not alloewed");
        }
        finally {
         //this guy always runs

         //also called clean up code (optional).
        }
        System.out.println("Flow of control is not crashed");

    }
//    static void methodA(int a , int b){
//        methodB(a,b);
//    }
//    static void methodB(int a , int b){
//        System.out.println(a / b);
//    }

}
