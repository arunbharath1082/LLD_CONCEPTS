package Java_IMP.Clone;

public class Student implements Cloneable{
    public int rollno;
    public String name;

    Student(int rollno,String name){
        this.name=name;
        this.rollno=rollno;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
