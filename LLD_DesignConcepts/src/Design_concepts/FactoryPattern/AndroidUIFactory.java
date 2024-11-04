package Design_concepts.FactoryPattern;

import Design_concepts.FactoryPattern.Components.button.AndroidButton;
import Design_concepts.FactoryPattern.Components.button.Button;
import Design_concepts.FactoryPattern.Components.menu.AndroidMenu;
import Design_concepts.FactoryPattern.Components.menu.Menu;

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
