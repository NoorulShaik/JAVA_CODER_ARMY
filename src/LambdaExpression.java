import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {
    /*
    The expressions are born overcome the verbose too lengthy code in Compareable -- Comparator interfaces.


    Lambda syntax:
    (parameter) --> expression

    here --> is called map to /gives to.
    let me copy the same code from prevFILE


    Types
    1.Multiple parameters: (a,b) -> a+b or a- b or b - a
    2.Single parameter : x -> x*X;
    3.No parameter: () -> sout()
    4.Multi line: (a,b) -> {
    int sum = a +b;
    return sum; //for this kind of lambdas better use class like we do in comparator .
     */
    public static void main(String[] args) {
        List<Example> list = new ArrayList<>();
        list.add(new Example("noorul" ,124,20));
        list.add(new Example("noorul shaik" ,122,22));
        list.add(new Example("noorul hussain" ,312,24));
        Collections.sort(list, (s1 ,s2) -> s1.roll -s2.roll);
//super simple syntax.
        for(Example val : list){
            System.out.println(val.roll + " " + val.age);
        }
    }
}



