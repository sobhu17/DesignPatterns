package AbstractFactoryDesignPattern;

public class UIFactoryFactory {

    public static UIFactory createFactoryOnTheBasisOfGivenPlatform(Platforms platform){
        return switch (platform){
            case iOS -> new iOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
