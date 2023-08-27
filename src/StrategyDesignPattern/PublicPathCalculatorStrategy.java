package StrategyDesignPattern;

public class PublicPathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Get public transport path!!!");
    }
}
