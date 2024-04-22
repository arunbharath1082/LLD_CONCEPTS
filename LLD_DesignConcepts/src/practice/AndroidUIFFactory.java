package practice;

import practice.components.button.AndroidBButton;
import practice.components.button.Button;

public class AndroidUIFFactory implements UIFFactoryFactory {
    @Override
    public Button createButton() {
        return new AndroidBButton();
    }
}
