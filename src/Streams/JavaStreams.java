package Streams;

import java.util.ArrayList;
import java.util.List;

public class JavaStreams {

    /*
    Streams:
    A stream is a tool for processing a sequence of data through a chain of operation.
    Stream are not used for Collecting data
    they are used for Data process

    ex;
    numbers.stream().filter().filter().map().forEach()

     Stream pipeline Architecture:
     Source--->Intermediate Operation --->Terminal Operation
     > Terminal operation is mandatory ,otherwise our stream will not work.
     >
     Sources:
     1.Collection
     2.Arrays
     3.Stream.of()
     4.Infinite stream


     Intermediate Operation /Transformation:
     1.filter(predicate)
     2.map(x->x*X) -function interface
     3.sorted()
     4.distint()
     5.limit()
     6.skip() etc..

     Terminal Operation:

     1.forEach
     2.tolist()
     3.collect()
     4.count()
     5.findfirst()


     No Terminal operation -- > NO Stram executed --Lazy loading

     Types of Streams:
     1.Sequential ex:list.stream()
     2.Parallel Stream ex:list.parallelStream()



     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4,75,23,12,657,1,2));
        list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}
