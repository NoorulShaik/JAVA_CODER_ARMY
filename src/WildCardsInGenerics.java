public class WildCardsInGenerics {
    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.eat();
//        a.walk();
        //invariant in generics

    }

}

class Animal{
    void eat(){
        System.out.println("Eating animal");
    }
    void walk(){
        System.out.println("ANimal is walking");
    }
}
class Dog extends Animal{
    void bar(){
        System.out.println("DOg is barking");
    }
}
