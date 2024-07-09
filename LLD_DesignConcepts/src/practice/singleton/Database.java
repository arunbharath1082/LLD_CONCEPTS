package practice.singleton;

public class Database {
    private static Database instance=null;

    public static Database getInstance(){
        if (instance==null){
            synchronized (Database.class){
                if (instance==null){
                    instance=new Database();
                }
            }

        }
        return instance;
    }
    public void display(){
        System.out.println("Arun bharath");
    }
}
