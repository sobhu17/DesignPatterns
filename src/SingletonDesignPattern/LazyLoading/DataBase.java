package SingletonDesignPattern.LazyLoading;

public class DataBase {
    private static DataBase instance = null;

    private DataBase(){

    }

    public static DataBase createInstance(){
        if(instance == null){
            instance = new DataBase();
        }

        return instance;
    }
}
