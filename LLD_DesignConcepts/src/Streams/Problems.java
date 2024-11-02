package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Problems {
    public static void main(String[] args) {

         //1.Write a program to find the sum of all elements in a list using Java Stream API
        List<Integer> num1= Arrays.asList(1,3,4,5);
        int value=num1.stream().mapToInt(Integer::intValue).sum();
        System.out.println("program 1-->sum  "+value);

        // 2.Given a list of integers, write a program to find and print
        // the maximum element using Java Stream API
        List<Integer> num2= Arrays.asList(1,3,4,5);
        int maxi=num2.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println("program 2-->Maximum element  "+maxi);

        //3. Write a program to filter out all the even numbers from a list
        // using Java Stream API
        List<Integer>num3=Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer>even=num3.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println("program 3-->even "+even.toString());

        //4.Given a list of strings, write a program to count the number of strings containing
        // a specific character ‘a’ using Java Stream API.

        List<String>words=Arrays.asList("apple", "banana", "orange", "grape");
        char searchChar='a';
        long count=words.stream().filter(string->string.contains(String.valueOf(searchChar))).count();
        System.out.println("program 4-->"+count);

        // 5.Write a program to convert a list of strings to uppercase using Java Stream API.
        List<String>strings=Arrays.asList("apple", "banana", "orange", "grape");
        List<String >ans=strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("program 5-->"+ans.toString());

        //6.Given a list of integers, write a program to calculate the
        // average of all the numbers using Java Stream API.
        List<Integer>num4=Arrays.asList(1,2,3,4,5,6,7,8);
        OptionalDouble avg=num4.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println("program 6-->"+avg);

        //7.Write a program to sort a list of strings in alphabetical
        // order using Java Stream API.
        List<String> strings1 = Arrays.asList("banana", "orange", "apple", "grape");
        List<String> sortedStrings = strings1.stream()
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println("program 7-->Sorted strings: " + sortedStrings);

        //8.Given a list of strings,
        // write a program to concatenate all the strings using Java Stream API.
        List<String> strings2 = Arrays.asList("apple", "banana", "orange", "grape");
        String concatenatedString = strings2.stream()
                                            .collect(Collectors.joining());
        System.out.println("program 8-->Concatenated string: " + concatenatedString);

        //9.Write a program to find the longest string in a list of strings using Java Stream API.

        List<String> strings3 = Arrays.asList("apple", "banana", "orange", "grape");
        Optional<String> longestString = strings3.stream()
                                                .max((str1, str2) -> str1.length() - str2.length());
        System.out.println("program 9-->Longest string: " + (longestString.isPresent() ? longestString.get() : "N/A"));

        //10. Given a list of integers, write a program to
        // find and print the second largest number using Java Stream API.
        List<Integer>numbers3=Arrays.asList(1,2,3,4,5,6,7);
        Optional<Integer> val=numbers3.stream().sorted((number1, number2)->number2-number1).skip(1).findFirst();
        System.out.println("Porgram 10-->second Largest number is "+val.get());

        //11. Write a program to remove all the duplicate elements
        // from a list using Java Stream API.
        List<Integer>numbers=Arrays.asList(1,1,2,2,3,3,4,4,5,6);
        List<Integer>ans1=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("program 11-->unique number "+ans1);

        //12.write a program to print smallest string in the list
        List<String> strings4 = Arrays.asList("apple", "banana", "orange", "grape");
        String smallest=strings4.stream().min((st1,st2)->st1.length()-st2.length()).orElse(null);
        System.out.println("program 12--> smallest string "+smallest);
    }
}
