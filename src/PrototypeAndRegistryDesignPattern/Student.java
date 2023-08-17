package PrototypeAndRegistryDesignPattern;

public class Student {
    private String name;
    private int age;
    private double averagePSP;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAveragePSP() {
        return averagePSP;
    }

    public void setAveragePSP(double averagePSP) {
        this.averagePSP = averagePSP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    private int gradYear;

    private String batch;

    public Student(){

    }

    public Student(Student o){
        this.age = o.age;
        this.email = o.email;
        this.averagePSP = o.averagePSP;
        this.name = o.name;
        this.gradYear = o.gradYear;
    }

    public Student Clone(){
        return new Student(this);
    }
}
