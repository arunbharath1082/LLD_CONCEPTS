package practice.factory.button;

public class AndroidUIFFactory implements UIFFactoryFactory {
    @Override
    public Button createButton() {
        return new AndroidBButton();
    }
}
