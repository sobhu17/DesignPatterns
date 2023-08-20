package DecoratorDesignPattern;

public class Berries implements IceCream{
    private IceCream iceCream;


    public Berries(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Berries";
    }
}
