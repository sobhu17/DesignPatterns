package StrategyDesignPatter;

public class PathCaluculatorFactory {

    public static PathCalculatorStrategy getPathCalculatorBasedOnMode(ModeOfTransport mode){
        return switch (mode){
            case BUS -> new BusPathCalculatorStrategy();
            case CAR -> new CarPathCalculatorStrategy();
            case WALK -> new WalkPathCalculatorStrategy();
            case PUBLIC -> new PublicPathCalculatorStrategy();
        };
    }
}
