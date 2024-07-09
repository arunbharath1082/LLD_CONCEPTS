package Streams;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        printNumber(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static void print(int num){
        System.out.println(num);
    }
    private static boolean even(int num){
      return num%2==0;
    }
    private static void printNumber(List<Integer> integers) {

//        normal structural apporach
//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }
//
        // functional apporach
        // forEach is a terminal operation
        // forEach takes a Consumer as an argument

//        integers.stream().forEach(Client::print);
//        integers.stream().forEach(num -> System.out.println(num));
//        integers.stream().forEach(System.out::println);

        // filter is an intermediate operation
        // filter takes a Predicate as an argument
        // filter returns a Stream

//        integers.stream().filter(Client::even).forEach(System.out::println);
//        integers.stream().filter(num -> num%2==0).forEach(System.out::println);

        // map is an intermediate operation
        // map takes a Function as an argument
        // map returns a Stream
//        integers.stream().filter(Client::even)
//                .map(num -> num * num)
//                .forEach(System.out::println);

        // reduce is a terminal operation
        // reduce takes a BinaryOperator as an argument
        // reduce returns a value
        int sum = integers.stream().filter(Client::even)
                .map(num -> num * num)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
