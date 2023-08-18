package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Components.Buttons.Button;
import AbstractFactoryDesignPattern.Components.Buttons.iOSButton;
import AbstractFactoryDesignPattern.Components.Dropdowns.Dropdown;
import AbstractFactoryDesignPattern.Components.Dropdowns.iOSDropdown;
import AbstractFactoryDesignPattern.Components.Menus.Menu;
import AbstractFactoryDesignPattern.Components.Menus.iOSMenu;

public class iOSUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new iOSButton();
    }

    @Override
    public Dropdown crateDropdown() {
        return new iOSDropdown();
    }

    @Override
    public Menu createMenu() {
        return new iOSMenu();
    }
}
