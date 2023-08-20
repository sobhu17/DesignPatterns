package DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        IceCream myIceCream =   new Berries(
                                    new ChocolateScoop(
                                        new VanillaScoop(
                                            new ChocolateSyrup(
                                                new ChocolateCone(
                                                   new OrangeCone()
                                                   )
                                            )
                                        )
                                    )
                                );


        System.out.println("Cost : " + myIceCream.getCost());
        System.out.println("Description : " + myIceCream.getDescription());


        /*
            If we have a scenario where we add properties features to a base entity at runtime where the final output
            depends on the output of base, consider using decorator design pattern

            Here in some classes we have two constructors that is because these classes can be used as base object
            and also as an addon.

            If we have an entity to which we may want to change behaviours/add to its behaviours at runtime
            consider using Decorator Design Pattern.

            Good examples of this can be - Coffee making machine
                                           Pizza making
         */
    }
}
