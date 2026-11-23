package Generics;

public class Generics {
    /*
    Generics.Generics help us avoid the runtime exceptions!!
     */
    public static void main(String[] args) {
//    Generics.Boxx<Integer> b = new Generics.Boxx<>(78); //type argument
//    Generics.Boxx<String> s = new Generics.Boxx<>("Noorul"); //type argument
//    Generics.Boxx<Boolean> bo = new Generics.Boxx<>(true); //type argument
//        System.out.println(b.getValue() + 5);


//        Generics.Pair<Integer> p = new Generics.Pair<>(4,5);
        Pairr<Integer,String> p = new Pairr<>(20,"Noorul");
          System.out.println(p.first + " " + p.second);
    }
}
class Boxx<T>{ //type parameter
    private T value; //T is a placeholder and it can be anything like N R P etc..
    //Box will store anytype of value
    Boxx(T value){
        this.value = value;

    }
    public T getValue(){
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
// this is another example ok.
class Pair<T>{
    T first;
    T second;
    Pair(T first ,T second){
        this.first = first;
        this.second = second;
    }

}
//Now we want to make the pair class to store two difernt types.
class Pairr<T ,U>{
    T first;
    U second;
    Pairr(T first ,U second){
        this.first = first;
        this.second = second;
    }

}