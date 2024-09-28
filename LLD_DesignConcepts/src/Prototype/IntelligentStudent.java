package Prototype;

public class IntelligentStudent extends Student{
    private int iq;
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public IntelligentStudent(){};

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq=intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent copy(){
        IntelligentStudent intelligentStudent=new IntelligentStudent(this);
        return intelligentStudent;
    }
}
