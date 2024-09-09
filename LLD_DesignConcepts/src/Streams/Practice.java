package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

        //Predicate
            // Predicate is a functional interface in Java
            // Predicate takes a single argument and returns a boolean
            // Predicate has a single method test
            Predicate<Integer> number= num -> num%2==0;
            System.out.println(number.test(10));


        //function
            // Function is a functional interface in Java
            // Function takes a single argument and returns a single value
            // Function has a single method apply
            // Function is used to transform an object into another object

        Function<Integer,Integer> square = num -> num*num;
        System.out.println(square.apply(5));

        //functional chaining
        // andThen
        // compose
        // andThen is used to combine two functions

        Function<Integer,Integer> add = num -> num+2;
        Function<Integer,Integer> multiply = num -> num*2;
        System.out.println(add.andThen(multiply).apply(5));
        System.out.println(add.compose(multiply).apply(5));



//Filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(result);



    //Map
    List<String> words = Arrays.asList("aa", "bb", "cc", "dd", "ee", "fff", "gsv", "hj", "k", "l");
    List<String> result1 = words.stream().map(String::toUpperCase).toList();
    System.out.println(result1);

    //flatmap
        // flatMap is used to flatten a Stream of collections into a Stream of elements

    List<List<String>> list = Arrays.asList(
            Arrays.asList("a"),
            Arrays.asList("b"));
    List<String> result2 = list.stream().flatMap(List::stream).toList();
    System.out.println(result2);


    //Distinct
        // distinct is used to remove duplicates from a Stream
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3);
    List<Integer> result3 = numbers1.stream().distinct().toList();
    System.out.println(result3);

    //Sorted
        // sorted is used to sort the elements of a Stream
        // reverse order
        // for ascending order use Comparator.naturalOrder()
    List<Integer> numbers2 = Arrays.asList(5, 3, 7, 1, 9, 2, 8, 4, 6, 10);
    List<Integer> result4 = numbers2.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println(result4);

    // peek
        // peek is used to perform an action on each element of a Stream
        // peek is an intermediate operation
        // peek takes a Consumer as an argument
        // peek returns a Stream
        // It is used to debug the Stream
    List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    numbers3.stream().peek(num -> System.out.println("processing " + num))
        .filter(num -> num % 2 == 0)
        .forEach(System.out::println);

    //limit
        // limit is used to reduce the size of a Stream
        // limit is an intermediate operation
        // limit takes a long as an argument
        // limit returns a Stream
    List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> result5 = numbers4.stream().limit(5).toList();
    System.out.println(result5);

    //skip
        // skip is used to skip the elements of a Stream
        // skip is an intermediate operation
        // skip takes a long as an argument
        // skip returns a Stream

    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> result6 = numbers5.stream().skip(5).toList();
    System.out.println(result6);

    //for
        // forEach is a terminal operation
        // forEach takes a Consumer as an argument
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers6.stream().forEach(System.out::println);

    //reduce
        // reduce is a terminal operation
        // reduce takes a BinaryOperator as an argument
        // reduce returns a value
        List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers7.stream().reduce(0, Integer::sum);
        System.out.println(sum);

    //allMatch
        // allMatch is a terminal operation
        // allMatch takes a Predicate as an argument
        // allMatch returns a boolean
        List<Integer> numbers8 = Arrays.asList(2, 4, 6, 8, 10);
        boolean result7 = numbers8.stream().allMatch(num -> num % 2 == 0);
        System.out.println(result7);

    //anyMatch
        // anyMatch is a terminal operation
        // anyMatch takes a Predicate as an argument
        // anyMatch returns a boolean
        List<Integer> numbers9 = Arrays.asList(1, 2, 3, 4, 5);
        boolean result8 = numbers9.stream().anyMatch(num -> num % 2 == 0);
        System.out.println(result8);

    //noneMatch
        // noneMatch is a terminal operation
        // noneMatch takes a Predicate as an argument
        // noneMatch returns a boolean
        List<Integer> numbers10 = Arrays.asList(1, 3, 5, 7, 9);
        boolean result9 = numbers10.stream().noneMatch(num -> num % 2 == 0);
        System.out.println(result9);

    //findfirst
        // findFirst is a terminal operation
        // findFirst returns an Optional
        List<Integer> numbers11 = Arrays.asList(1, 2, 3, 4, 5);
        numbers11.stream().filter(n->n%2==0).findFirst().ifPresent(System.out::println);

    //findAny
        // findAny is a terminal operation
        // findAny returns an Optional
        List<Integer> numbers12 = Arrays.asList(1, 2, 3, 4, 5);
        numbers12.stream().filter(num -> num % 2 == 0).findAny().ifPresent(System.out::println);

    //Max
        // max is a terminal operation
        // max takes a Comparator as an argument
        // max returns an Optional
        List<Integer> numbers13 = Arrays.asList(1, 12, 3, 4, 5);
        numbers13.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
    //toarray
        // toArray is a terminal operation
        // toArray returns an array
        List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] array = numbers14.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    //joining
        // joining is a terminal operation
        // joining takes a delimiter, a prefix, and a suffix as arguments
        // joining returns a String
        List<String> words1 = Arrays.asList("aa", "bb", "cc", "dd", "ee");
        String result10 = words1.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result10);

    //groupby
        // groupBy is a terminal operation
        // groupBy takes a Function as an argument
        // groupBy returns a Map
        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map<Integer, List<String>> result11 = words2.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result11);
    }
}
