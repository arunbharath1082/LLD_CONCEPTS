package BuilderPattern;

public class Student {
//builder pattern
    String name;
    String uniName;
    int age;
    int gradYear;
    double psp;
    String batch;
    String companyName;


    public Student(Builder builder) {
        this.name=builder.name;
        this.age=builder.age;
        this.batch=builder.batch;
        this.uniName=builder.uniName;
    }

    public static Builder getBuilder(){
        return new Builder() ;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
    public String getName() {
    return name;
}
    public String getUniName() {
        return uniName;
    }

//    public void setUniName(String uniName) {
//        this.uniName = uniName;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getGradYear() {
        return gradYear;
    }

//    public void setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    static class Builder{
        String name;
        String uniName;
        int age;

        int gradYear;
        double psp;
        String batch;
        String companyName;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getUniName() {
            return uniName;
        }

        public Builder setUniName(String uniName) {
            this.uniName = uniName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getCompanyName() {
            return companyName;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return  this;
        }

        public Student build(){
            if(this.getGradYear()>2022){
                throw new IllegalArgumentException("Grad year can't be greater than 2022");
            }
            return new Student(this);
        }



    }
}
