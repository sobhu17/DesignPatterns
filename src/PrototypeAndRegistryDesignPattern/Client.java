package PrototypeAndRegistryDesignPattern;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student march2022IntermediateStudent = new Student();
        march2022IntermediateStudent.setAveragePSP(98.5);
        march2022IntermediateStudent.setBatch("March 2022 Intermediate");
        studentRegistry.register("March 2022 Intermediate" , march2022IntermediateStudent);

        IntellegentStudent feb2021AdvancedIntelligentStudent = new IntellegentStudent();
        feb2021AdvancedIntelligentStudent.setAveragePSP(92.4);
        feb2021AdvancedIntelligentStudent.setBatch("Feb 2021 Advanced");
        studentRegistry.register("Feb 2021 Advanced" , feb2021AdvancedIntelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student saurabh = studentRegistry.get("March 2022 Intermediate");
        saurabh.setName("Saurabh Kaushik");
        saurabh.setAge(25);
        saurabh.setEmail("saurabh@gmail.com");
        saurabh.setGradYear(2020);

        Student amit = studentRegistry.get("Feb 2021 Advanced");
        amit.setName("Amit Yadav");
        amit.setAge(27);
        amit.setEmail("amit@gmail.com");
        amit.setGradYear(2019);

        System.out.println("Debug!!!");
    }
}
