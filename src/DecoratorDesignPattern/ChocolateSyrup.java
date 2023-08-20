package DecoratorDesignPattern;

public class ChocolateSyrup implements IceCream{
    private IceCream iceCream;


    public ChocolateSyrup(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Chocolate Syrup";
    }
}
