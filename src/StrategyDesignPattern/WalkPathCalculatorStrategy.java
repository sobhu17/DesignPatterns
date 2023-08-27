package StrategyDesignPattern;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Get walk path!!!");
    }
}
