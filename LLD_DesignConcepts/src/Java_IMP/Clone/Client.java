package Java_IMP.Clone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student(11,"arun");
        Student s2=(Student)s1.clone();
        s2.name="hi";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
