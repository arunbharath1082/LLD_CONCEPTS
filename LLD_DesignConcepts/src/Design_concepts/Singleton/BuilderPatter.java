package Design_concepts.Singleton;

public class BuilderPatter {
    private String name;
    private int age;
    private String address;
    private String phone;

    private BuilderPatter(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String phone;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public BuilderPatter build() {
            return new BuilderPatter(this);
        }
    }

    public static void main(String[] args) {
        BuilderPatter builderPatter = new BuilderPatter.Builder("John", 30)
                .setAddress("123, Baker Street")
                .setPhone("1234567890")
                .build();
    }
}
