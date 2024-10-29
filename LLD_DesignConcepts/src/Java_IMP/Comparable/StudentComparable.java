package Java_IMP.Comparable;

public class StudentComparable implements Comparable<StudentComparable>{

    public String name;
    public int age;

    StudentComparable(String name, int age){
        this.age=age;
        this.name=name;
    }




    @Override
    public int compareTo(StudentComparable obj) {
        return this.age- obj.age;
    }
}
