package SingletonDesignPattern.LazyLoading;

public class Client {
    public static void main(String[] args) {
        DataBase db1 = DataBase.createInstance();
        System.out.println(db1);

        DataBase db2 = DataBase.createInstance();
        System.out.println(db2);

        /*
        Here this is a singleton class we can onl create one and only one object of this class
        For this we have defined its constructor as private as private constructor can't be called outside this class
        but not we can't even create a single instance of this class

        For this we create a public method that will create an instance for us and return it
        But to access this method we still need a object of this class

        To access this public method we can mark this class as static so that we can access it using class name.

        There is an issue with this way of creating singleton class as it will not work for multithreaded environment

        To avoid this multithreading issue we have two more methods of defining a class singleton


        When to use singleton design pattern
            1. when classes have shared resources behind the scenes
            2. When the class is stateless that is there is no attributes in a class
            3. Objects are immutable
            4. Objects are expensive to create.
     */



    }
}
