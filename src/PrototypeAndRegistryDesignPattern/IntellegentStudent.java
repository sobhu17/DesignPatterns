package PrototypeAndRegistryDesignPattern;

public class IntellegentStudent extends Student{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntellegentStudent(){

    }

    public IntellegentStudent(IntellegentStudent o){
        super(o);
        this.iq = o.iq;
    }


    public Student Clone(){
        return new IntellegentStudent(this);
    }
}
