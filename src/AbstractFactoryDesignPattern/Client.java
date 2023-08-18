package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Components.Buttons.Button;
import AbstractFactoryDesignPattern.Components.Dropdowns.Dropdown;
import AbstractFactoryDesignPattern.Components.Menus.Menu;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter(Platforms.iOS);
        UIFactory uiFactory = flutter.createFactory();
        Button b = uiFactory.createButton();
        b.changeButtonSize();

        Dropdown d = uiFactory.crateDropdown();
        d.changeDropdownSize();

        Menu m = uiFactory.createMenu();
        m.changeMenuSize();


        /*
                Factory design pattern is basically is used when a class object is used
                to create another object of the corresponding class
                like here we are using UIFactory object to create corresponding objects of platforms

                -> any method that is creating object of some corresponding class is known as Factory method
                -> If we place all the Factory methods separately in some other class then it is known as
                   Abstract Factory
                -> In order to get the correct Platform we have used UIFactoryFactory which is nothing but
                   an example of Practical Factory which is the most used Design Pattern

                to combine the main class and the interface/class that holds all the Factory methods we have created a
                reference method that is createFactory() to connect both the classes

         */

    }
}
