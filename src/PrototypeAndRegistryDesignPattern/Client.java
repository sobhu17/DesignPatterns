package PrototypeAndRegistryDesignPattern;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student march2022IntermediateStudent = new Student();
        march2022IntermediateStudent.setBatch("March 2022 Intermediate");
        march2022IntermediateStudent.setAveragePSP(95.2);
        studentRegistry.Register("March 2022 Intermediate" , march2022IntermediateStudent);

        IntelligentStudent feb2021AdvancedIntelligentStudent = new IntelligentStudent();
        feb2021AdvancedIntelligentStudent.setBatch("Feb 2021 Advanced");
        feb2021AdvancedIntelligentStudent.setAveragePSP(98.6);
        feb2021AdvancedIntelligentStudent.setIq(99);
        studentRegistry.Register("Feb 2021 Advanced" , feb2021AdvancedIntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student saurabh = studentRegistry.Get("March 2022 Intermediate");
        saurabh.setAge(24);
        saurabh.setName("Saurabh Kaushik");
        saurabh.setEmail("saurabh@gmail.com");

        Student amit = studentRegistry.Get("Feb 2021 Advanced");
        amit.setEmail("amit@gmail.com");
        amit.setName("Amit Yadav");
        amit.setAge(27);

        System.out.println("Debug!!!");


        /*
            Prototype design pattern is used to make copies of an object
            If we create copy by assigning values one by one then it is hard to access the
            private attributes on a class

            Suppose we have child class object in a parent class variable that will also creates problem
            in intelligent student we have attr 'iq' which we cant access using Student varibale name

            If we use multiple if/else in client then it will lead to violet SRP/OCP
            Copy constructor has same issue as we don't know which object is there in Student variable
            Similarly a Clone method alone in every class will also not work
            But we have to keep in mind to put Cone method in each and every class

            We need a solution such that each class will provide a method to create its copy

            So for this we use combination of Cone() method and Copy Constructor together

            In cone method we just call the copy constructor of that class and copy constructor
            of parent will get called itself due to constructor chaining.

            It is possible that we need to get the same type of object again and again that has
            same attribute values.
            So for this what we can do is create a registry and put key and values there
            String and object respectively

            from this registry we can get an object template and just change the attribute values
            that are different

         */

    }
}
