package PrototypeAndRegistryDesignPattern;

public class Student {
    private String name;
    private String batch;
    private int age;
    private String email;
    private double averagePSP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAveragePSP() {
        return averagePSP;
    }

    public void setAveragePSP(double averagePSP) {
        this.averagePSP = averagePSP;
    }

    public Student(){

    }

    public Student(Student o){
        this.name = o.name;
        this.batch = o.batch;
        this.age = o.age;
        this.email = o.email;
        this.averagePSP = o.averagePSP;
    }


    public Student Clone(){
        return new Student(this);
    }

}
