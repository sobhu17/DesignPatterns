package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Components.Buttons.AndroidButton;
import AbstractFactoryDesignPattern.Components.Buttons.Button;
import AbstractFactoryDesignPattern.Components.Dropdowns.AndroidDropdown;
import AbstractFactoryDesignPattern.Components.Dropdowns.Dropdown;
import AbstractFactoryDesignPattern.Components.Menus.AndroidMenu;
import AbstractFactoryDesignPattern.Components.Menus.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown crateDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
