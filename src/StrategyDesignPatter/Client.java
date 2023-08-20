package StrategyDesignPatter;

public class Client {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();

        googleMap.findPath("Delhi" , "Saharanpur" , ModeOfTransport.CAR);


        /*
            Strategy design patter is the most important design pattern as it will be used in many case studies

            In this to avoid using multiple if else to get path based on desired mode of transport we can create
            an interface for pathCalculatorStrategy which will have common method that need to be implemented by all
            the mode of paths calculators

            Strategy design pattern works in a close relation with Factory design pattern in order to avoid
            violating SRP and OCP

            So, consider using Strategy design pattern if we have multiple ways to perform a behaviour
         */


    }
}
