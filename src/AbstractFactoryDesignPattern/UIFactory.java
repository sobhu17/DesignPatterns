package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Components.Buttons.Button;
import AbstractFactoryDesignPattern.Components.Dropdowns.Dropdown;
import AbstractFactoryDesignPattern.Components.Menus.Menu;

public interface UIFactory {

    public Button createButton();

    public Dropdown crateDropdown();

    public Menu createMenu();

}
