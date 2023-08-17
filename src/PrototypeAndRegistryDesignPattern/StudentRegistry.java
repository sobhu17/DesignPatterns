package PrototypeAndRegistryDesignPattern;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String , Student> map = new HashMap<>();

    public void register(String key , Student value){
        map.put(key , value);
    }

    public Student get(String key){
        return map.get(key);
    }

}
