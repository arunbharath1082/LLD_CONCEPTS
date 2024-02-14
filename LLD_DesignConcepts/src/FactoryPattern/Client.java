package FactoryPattern;

import FactoryPattern.Components.button.Button;
import FactoryPattern.Components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIFactory uiFactory=flutter.getUIFactory(SupportedPlatforms.ANDROID);
        Button button=uiFactory.createButton();
        Menu menu=uiFactory.createMenu();
        button.click();;
        menu.chechMenu();

    }
}
