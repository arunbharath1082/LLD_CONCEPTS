package FactoryPattern;

import FactoryPattern.Components.button.Button;
import FactoryPattern.Components.menu.Menu;

public interface UIFactory {
    Button createButton(); //Factory method

    Menu createMenu(); //Factory method
}
