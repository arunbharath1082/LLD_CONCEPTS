package practice;

public class client {
    public static void main(String[] args) {
        Student1 student = Student1.getBuilder()
                .setName("Arun")
                .setAge(24)
                .setBatch("morning")
                .build();
        System.out.println(student.getName());
    }
}
