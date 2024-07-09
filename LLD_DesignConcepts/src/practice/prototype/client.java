package practice.prototype;

public class client {
    private static void fillRegistry(StudentRegistry registry){
        StudentPrototype mornig=new StudentPrototype();
        mornig.setBatch("morning");
        mornig.setAvgpsp(88);
        registry.addRegistry("morning",mornig);

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry(studentRegistry);

        StudentPrototype student1=studentRegistry.getObj("morning").copy();
        student1.setName("Arun");
        student1.setAge(24);
        System.out.println("debug");




    }


}
