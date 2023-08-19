package FacadeDesignPattern;

import AbstractFactoryDesignPattern.Components.Buttons.AndroidButton;

public class Client {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        amazon.orderPlaced();


        /*
            Facade design pattern is used to simplify the code of client like here we have simplified the code of Amazon
            class by making a separate class for OrderPlacedHelper and OrderCancelledHelper

            it helps us to reduce the large number of objects usage in a single class.

            If we don't have Helper class then we have to declare large number of objects within the Amazon class
            which is ver complex to understand.

           Facade means boundary/outside of a building like a building looks very simple from outside but from inside it
           has many rooms and stuff which is complex

           Similarly, we try to make out code base look less complex by using Facade design pattern.

         */

    }

}
