package Prototype;

public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private double psp;
    private String batch;
    private double avgBatchPsp;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }



    public Student(){}

    public  Student(Student student){
        this.name=student.name;
        this.age=student.age;
        this.batch=student.batch;
        this.psp=student.psp;
        this.avgBatchPsp=student.avgBatchPsp;
    }
    @Override
    public Student copy() {
        Student copy=new Student(this);
        return copy;
    }
}
