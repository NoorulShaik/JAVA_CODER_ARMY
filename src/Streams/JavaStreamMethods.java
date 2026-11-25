package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamMethods {
    /*
    List of Intermediate Functions:
    1.filter()
    2.map()
    3.mapToInt()
    4.mapToDOuble()
    5.flatMap()
    6.sorted()
    7.limit()
    8.skip()
    9.distinct()
    10.peek()



    List of terminal operations:
    1.collecting results -tolist() -collect()
    2.reducing -reduce() -sum() max() min() average() count()
    3.searching/matching - findFirst() finsAny() anyMatch() allMatch() noneMatch()
    4.Iterations -forEach() -forEachOrdered()


     */
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(List.of(4,2,45,7, 7,73));

//        li.stream()
//                .filter(x->x>6)
//                .map(x->x*2)
//                .peek(System.out::println)
//                .sorted((a,b) -> b - a)
//                .distinct()
//                .forEach(System.out::println);

//        Stream.iterate(1,x->x+1)
//                .limit(10)
//                .skip(7) //skips the first 7 numbers
//                .forEach(System.out::println);


        //Terminal operations starts here
//        List<Integer> lis = li.stream()
//                .map(x -> x + 1)
//                .toList();
                //.forEachOrdered(System.out::println);
        //System.out.println(lis);
//     int sum = li.stream().reduce(1,(a,b) -> a+ b);
//        System.out.println(sum);
        //reduc() --combines multiple elements into single element
//       long num = li.stream().filter(x -> x>5)
//                .count();
//        System.out.println(num);


    }
}
