package Design_concepts.Prototype;

public class Client {
private  static void fillRegistry(StudentRegistry registry){
    Student mar22MornigStudent=new Student();
    mar22MornigStudent.setBatch("mar22Mornig");
    mar22MornigStudent.setAvgBatchPsp(70.0);
    registry.register("mar22MorningStudent",mar22MornigStudent);

    IntelligentStudent mar22MorningIntelligentStudent=new IntelligentStudent();
    mar22MorningIntelligentStudent.setIq(180);
    mar22MorningIntelligentStudent.setBatch("Mar22 Morning");
    mar22MorningIntelligentStudent.setAvgBatchPsp(70.0);
    registry.register("mar22MorningIntelligentStudent",mar22MornigStudent);
}

    public static void main(String[] args) {
        StudentRegistry registry=new StudentRegistry();
        fillRegistry(registry);

        Student Arun=registry.get("mar22MorningStudent").copy();
        Arun.setName("Arun");
        Arun.setAge(25);
        Arun.setPsp(70.0);

        Student rithi =registry.get("mar22MorningIntelligentStudent").copy();
        System.out.println("debug");
    }
}
