public class Generics {
    /*
    Generics help us avoid the runtime exceptions!!
     */
    public static void main(String[] args) {
//    Boxx<Integer> b = new Boxx<>(78); //type argument
//    Boxx<String> s = new Boxx<>("Noorul"); //type argument
//    Boxx<Boolean> bo = new Boxx<>(true); //type argument
//        System.out.println(b.getValue() + 5);


//        Pair<Integer> p = new Pair<>(4,5);
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