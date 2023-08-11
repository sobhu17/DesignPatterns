package EagerLoading;

public class Client {
    public static void main(String[] args) {
        DataBase db1 = DataBase.createInstance();
        System.out.println(db1);


        DataBase db2 = DataBase.createInstance();
        System.out.println(db2);

        /*
            In Eager Loading we initialize our instance at the time of class loading
            so, it will help us to tackle the multithreading problem

            But here we have another problem
                1. the startup time will increase in Eager loading
                2. If we have some attributes in our Singleton class then at the time of class loading we don't have
                    information regarding these attributes which makes it the drawback of Eager Loading
     */



    }
}
