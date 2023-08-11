package SingletonDesignPattern.DoubleCheckLocking;

public class Client {
    public static void main(String[] args) {
        DataBase db1 = DataBase.createInstance();
        System.out.println(db1);

        DataBase db2 = DataBase.createInstance();
        System.out.println(db2);


            /*
        public synchronized static DataBase createInstance(){
        if(instance == null){
            instance = new DataBase();
        }

        return instance;
    }

        this is the correct way of handling multithreaded environment but here we are doing way too much
        as we are taking lock everytime a new thread come to access this method
        But we only need lock for the first few threads, once our object get created we don't need to take lock
            again and again.
    */


     /*
        Here we are using double check locking like the GF and BF example
        Check twice before going out with the girl whether she is single or not
        same with object creation check if the object is created or not two times to confirm
     */


    }
}
