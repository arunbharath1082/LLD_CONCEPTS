package Design_concepts.FactoryPattern;

import Design_concepts.FactoryPattern.Components.button.Button;
import Design_concepts.FactoryPattern.Components.button.WindowButton;
import Design_concepts.FactoryPattern.Components.menu.Menu;
import Design_concepts.FactoryPattern.Components.menu.WindowsMenu;

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
