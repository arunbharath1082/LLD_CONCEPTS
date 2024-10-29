package Java_IMP.Comparable;

import Java_IMP.Comparator.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<StudentComparable>studentComparables= Arrays.asList(
                new StudentComparable("Arunnnnn",21),
                new StudentComparable("kaviii",31),
                new StudentComparable("inder",26),
                new StudentComparable("rithi",24)
        );
        Collections.sort(studentComparables);
        for(StudentComparable studentComparable:studentComparables){
            System.out.println(studentComparable.name);

        }

    }
}
