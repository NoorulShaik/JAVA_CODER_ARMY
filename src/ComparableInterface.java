import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {
    List<Std> list = new ArrayList<>();
    list.add(new Std(4,"noorul hussain shaik"));
    list.add(new Std(4,"noorul"));
    list.add(new Std(5,"shaik noorul"));
    list.add(new Std(6,"noorul hussain"));
    Collections.sort(list);
    for(Std student : list){
        System.out.println(student.roll + " " + student.name);
    }
    //Collections.rotate(list ,2);
    //System.out.println(list);
//    List<Integer> li = new ArrayList<>();
//    li.add(4);
//    li.add(1);
//    li.add(8);
//    Collections.sort(li);
//    System.out.println(li); //[1, 4, 8]
//    for(Integer val : li){
//        System.out.print(val +" ");
//    }
//    Integer a = 13;
//    int b = a;


    }
}
class Std implements Comparable<Std> {

    int roll;
    String name;

    public Std(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    @Override
    public int compareTo(Std other){
        if(this.roll != other.roll){
            return this.roll - other.roll;
        }
        return this.name.compareTo(other.name);
    }
}