package PrototypeAndRegistryDesignPattern;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String , Student> map = new HashMap<>();

    public void Register(String key , Student value){
        map.put(key , value);
    }

    public Student Get(String key){
        return map.get(key);
    }
}
