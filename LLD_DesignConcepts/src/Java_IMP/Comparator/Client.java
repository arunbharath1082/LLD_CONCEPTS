package Java_IMP.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        SortComparator sortComparator=new SortComparator();

        List<Student> students= Arrays.asList(
                new Student("Arun",23),
                new Student("kavi",31),
                new Student("rithi",24),
                new Student("inde",26)
        );
        Collections.sort(students,sortComparator);
        for(Student student:students){
            System.out.println(student.name);

        }
    }
}
