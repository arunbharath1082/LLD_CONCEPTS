package practice.singleton;

public class client {
    public static void main(String[] args) {
        Database obj=Database.getInstance();
        System.out.println(obj);
        obj.display();
    }
}
