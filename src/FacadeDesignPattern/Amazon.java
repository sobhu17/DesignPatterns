package FacadeDesignPattern;

public class Amazon {
    OrderPlacedHelper orderPlacedHelper = new OrderPlacedHelper();

    public void orderPlaced(){
        orderPlacedHelper.onOrderPlacement();
    }

}
