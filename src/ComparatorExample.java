import OOPS.Student;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.*;
public class ComparatorExample {
    /*
    Comparator interface is called functional interface because it has only one method.
     */
    public static void main(String[] args) {
    List<Example> list = new ArrayList<>();
    list.add(new Example("noorul" ,124,20));
    list.add(new Example("noorul shaik" ,122,22));
    list.add(new Example("noorul hussain" ,312,24));
//    Comparator<Example> ob = new SortByName();
//    Comparator<Example> ob1 = new SortByRoll();
//    Comparator<Example> ob2 = new SortByAge();
    Collections.sort(list,new Comparator<Example>(){
        @Override
        public int compare(Example a ,Example b){
            return a.roll - b.roll;
        }
        //like this we can use ananymous class
    });



    for(Example val : list){
        System.out.println(val.roll + " " + val.age);
    }

    }

}
class SortByName implements Comparator<Example>{
    @Override
    public int compare(Example a ,Example b){
        return a.name.compareTo(b.name);
    }
}
class SortByRoll implements Comparator<Example>{
    @Override
    public int compare(Example a ,Example b){
        return a.roll - b.roll;
    }
}
class SortByAge implements Comparator<Example>{
    @Override
    public int compare(Example a ,Example b){
        return a.age - b.age;
    }
}//Still the above code looks too much and verbose then comes ananymous class into picture!
class Example{
    String name;
    int roll;
    int age;

    public Example(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }
}