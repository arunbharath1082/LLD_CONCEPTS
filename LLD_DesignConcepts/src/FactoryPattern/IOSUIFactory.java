package FactoryPattern;

import FactoryPattern.Components.button.Button;
import FactoryPattern.Components.button.IOSButton;
import FactoryPattern.Components.menu.IOSMenu;
import FactoryPattern.Components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
