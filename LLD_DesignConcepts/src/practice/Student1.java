package practice;

public class Student1 {

    private String name;
    private int age;
    private String batch;

    private Student1(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
    }

    public String getName() {
        return name;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

     static class Builder {
        private String name;
        private int age;
        private String batch;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Student1 build() {
            return new Student1(this);
        }
    }
}
