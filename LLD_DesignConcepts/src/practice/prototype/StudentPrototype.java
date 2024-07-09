package practice.prototype;



public class StudentPrototype implements Prototype{

    public StudentPrototype(){}
    public StudentPrototype(StudentPrototype studentPrototype){
        this.age=studentPrototype.age;
        this.name=studentPrototype.name;
        this.batch=studentPrototype.batch;
        this.psp=studentPrototype.psp;
        this.avgpsp=studentPrototype.avgpsp;
    };

   public String name;
   public String batch;
   public int age;
   public int psp;
   public int avgpsp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public int getAvgpsp() {
        return avgpsp;
    }

    public void setAvgpsp(int avgpsp) {
        this.avgpsp = avgpsp;
    }

    @Override
    public StudentPrototype copy() {
        StudentPrototype obj1=new StudentPrototype(this);
        return obj1;
    }
}
