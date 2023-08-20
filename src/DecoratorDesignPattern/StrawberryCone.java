package DecoratorDesignPattern;

public class StrawberryCone implements IceCream{
    private IceCream iceCream;

    public StrawberryCone(){

    }

    public StrawberryCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 20;
        }
        return 20;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + " + Strawberry Cone";
        }
        return "Strawberry Cone";
    }
}
