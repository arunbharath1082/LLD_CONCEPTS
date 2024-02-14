package FactoryPattern;

import FactoryPattern.Components.button.Button;
import FactoryPattern.Components.button.WindowButton;
import FactoryPattern.Components.menu.Menu;
import FactoryPattern.Components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
