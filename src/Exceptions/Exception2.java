package Exceptions;

public class Exception2 {
    public static void main(String[] args) {
//        try{
//            chechEligi(-9);
//        }
//        catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Stp 2");
//the above is option 1

    }
    private static void chechEligi(int age){
        if(age < 0){
            //System.out.println("Age cant be neg");
            throw new IllegalArgumentException("Age cant be Negative");
        }
        if(age >= 18){
            System.out.println("Eligible to vote");
        }
    }
}
