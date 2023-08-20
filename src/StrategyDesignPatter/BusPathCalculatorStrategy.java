package StrategyDesignPatter;

public class BusPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Get bus path!!!");
    }
}
