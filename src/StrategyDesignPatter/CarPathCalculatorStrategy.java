package StrategyDesignPatter;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Get car path!!!");
    }
}
