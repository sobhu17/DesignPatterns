package PrototypeAndRegistryDesignPattern;

public class IntelligentStudent extends Student{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(){

    }

    public  IntelligentStudent(IntelligentStudent o){
        super(o);
        this.iq = o.iq;
    }

    public IntelligentStudent Clone(){
        return new IntelligentStudent(this);
    }
}
