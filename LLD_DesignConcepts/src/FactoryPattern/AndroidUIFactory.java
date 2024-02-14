package FactoryPattern;

import FactoryPattern.Components.button.AndroidButton;
import FactoryPattern.Components.button.Button;
import FactoryPattern.Components.menu.AndroidMenu;
import FactoryPattern.Components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
