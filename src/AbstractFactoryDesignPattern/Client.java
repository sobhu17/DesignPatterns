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
    }
}
