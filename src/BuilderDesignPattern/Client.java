package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {

        /*
                This is a more intuitive way of creating an object.
                Builder Design pattern is basically used when we have large number of attributes in a class
                And we have to do validations on attributes before the object creation.

                SO we need a DS that helps us to hold multiple values of different data types so, we use class as data
                structure for that issue(map has some issues as we can't do checks for keys and data types of values in hashmap)

                Class helps us to overcome all the problems like -
                        1) multiple values with diff data types
                        2) check on keys at runtime
                        3) check on values data type at runtime


         */

        Student s1 = Student.createBuilder()
                        .setName("Saurabh Kaushik")
                        .setAge(24)
                        .setBatch("March_2022_Intermediate")
                        .setEmail("saurabh@gmail.com")
                        .setPsp(98)
                        .setGradYear(2020)
                        .setUniversity("AKTU")
                        .Build();

        Student s2 = Student.createBuilder()
                .setName("Lakshay Jain")
                .setAge(24)
                .setBatch("November_2021_Intermediate")
                .setEmail("slakshay@gmail.com")
                .setPsp(91)
                .setGradYear(2020)
                .setUniversity("IPU")
                .Build();

        System.out.println("Debug!!!");


//        Student.Builder b = Student.createBuilder();
//
//        b.setName("Saurabh Kaushik");
//        b.setAge(24);
//        b.setBatch("March_2022_Intermediate");
//        b.setEmail("sayrabh@gmail.com");
//        b.setPsp(98);
//        b.setGradYear(2020);
//        b.setUniversity("AKTU");
//
//        Student s1 = b.Build();
//
//        System.out.println("Debug!!!");

        /*
            the problem here is we can still access the constructor of Student class and client can pass null as builder
            which will cause issue. So, for this we have to declare Student as Private

            And the name Builder is quite misleading as it is not building something so, we have to build something
            in Builder class so lets build Student object here.

            And we want Student to give us Builder object instead we creating it separately.

         */
    }

}
