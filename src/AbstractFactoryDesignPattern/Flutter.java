package AbstractFactoryDesignPattern;

public class Flutter {

    private Platforms platform;

    public Flutter(Platforms platform){
        this.platform = platform;
    }

    public void buildApplication(){
        System.out.println("Application building is in progress........");
    }

    public void createVersion(){
        System.out.println("Version is being created.......");
    }

    public UIFactory createFactory(){
        return UIFactoryFactory.createFactoryOnTheBasisOfGivenPlatform(platform);
    }

}
