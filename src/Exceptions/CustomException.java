package Exceptions;

public class CustomException {
    public static void main(String[] args) {
          //these exceptions are developer made based on the situation
        try{
            chechEligi(-9);
        }
        catch (IvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
    private static void chechEligi(int age) throws IvalidAgeException{
        if(age < 0){
            //System.out.println("Age cant be neg");
            throw new IvalidAgeException("Age cant be Negative");
        }
        if(age >= 18){
            System.out.println("Eligible to vote");
        }
    }
}
class IvalidAgeException extends RuntimeException{
    public IvalidAgeException(String message){
        super(message);
    }
}