public class GenericMethods {
    public static void main(String[] args) {
    String y = getResult("Noorul");
       // System.out.println(y);
        getAns(12,"Noorul"); //type inference
    }
    public static <T> T getResult(T x){
        return x;
    }
    public static <T,U> void getAns(T x ,U y){ //type paremeters
        System.out.println(x +"  " + y);
    }
    //Generic methods
    //Syntax looks like
    //<T> returnType methodName(T parameter){}
}
