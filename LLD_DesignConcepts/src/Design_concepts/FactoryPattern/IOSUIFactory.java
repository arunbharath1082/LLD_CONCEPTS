package Design_concepts.FactoryPattern;

import Design_concepts.FactoryPattern.Components.button.Button;
import Design_concepts.FactoryPattern.Components.button.IOSButton;
import Design_concepts.FactoryPattern.Components.menu.IOSMenu;
import Design_concepts.FactoryPattern.Components.menu.Menu;

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
