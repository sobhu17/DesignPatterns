package StrategyDesignPatter;

public class GoogleMap {

    public void findPath(String from , String to , ModeOfTransport mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCaluculatorFactory.getPathCalculatorBasedOnMode(mode);

        pathCalculatorStrategy.calculatePath(from , to);

    }

}
