package Design_concepts.FactoryPattern;

import Design_concepts.FactoryPattern.Components.button.Button;
import Design_concepts.FactoryPattern.Components.menu.Menu;

public interface UIFactory {
    Button createButton(); //Factory method

    Menu createMenu(); //Factory method
}
