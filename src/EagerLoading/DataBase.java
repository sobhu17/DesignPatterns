package EagerLoading;

public class DataBase {
    private static DataBase instance = new DataBase();

    private DataBase(){

    }

    public static DataBase createInstance(){
        return instance;
    }
}
