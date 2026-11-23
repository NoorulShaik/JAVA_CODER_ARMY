package Generics;

public class IntroToGenerics {
    /*
    Limitations of using Object as Universal TYpe
    1.Type information is lost
    2.wrong object could be inserted
    3.Casting became necessary when reading
    4.Many errors shift to runtime
     */
    public static void main(String[] args) {
        Box b = new Box(29); //ok
        Box b1 = new Box("Hello"); //ok
        Box b2 = new Box(true); //ok

        //
        System.out.println(b.getValue());
        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
        //no problem we are getting the answers.
        //THen what is the problem? what if we want to read the values and do some operations on them?
        //Unless until we know the types we cant downcast values.

    }
}
class Box{
    private Object value;
    //Generics.Box will store anytype of value
    Box(Object value){
        this.value = value;

    }
    public Object getValue(){
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
