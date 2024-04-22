package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("Arun");
        Student student=Student.getBuilder()
                .setGradYear(2022)
                .setName("Arun Bharath")
                .setAge(24)
                .setUniName("xyz")
                .setBatch("morning")
                .build();

        System.out.println(student.getBatch());
    }
}
