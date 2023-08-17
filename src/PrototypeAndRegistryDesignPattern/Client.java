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

    }
}
