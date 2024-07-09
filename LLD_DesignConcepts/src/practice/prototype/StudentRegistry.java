package practice.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    public  Map<String,StudentPrototype> map=new HashMap<>();
    public  void addRegistry(String key,StudentPrototype studentPrototype){
        map.put(key,studentPrototype);
    }
    public StudentPrototype getObj(String key){
        return map.get(key);
    }
}
