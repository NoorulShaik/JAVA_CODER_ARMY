import java.util.function.*;
public class LambdasFunctionalInterfacesDeep {
    public static void main(String[] args) {
        //Types are
        /*
        1.Function --takes and gives
        2.Consumer --takes input gives nothing
        3.Supplier --takes void returns somthing
        4.Predicate --takes an input returns boolean
         */
        Function<Integer ,Integer> square = (x) -> x*x;
        System.out.println(square.apply(5));

        Consumer<Integer> consume = x -> System.out.println(x);
        consume.accept(67); //takes imput returns void
        Supplier<Double> supp = () -> Math.random();
        System.out.println(supp.get());
        Predicate<Integer> pred = (x) -> (x%2 == 0);
        System.out.println(pred.test(6));














    }

}
