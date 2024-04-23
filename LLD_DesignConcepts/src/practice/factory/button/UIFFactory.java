package practice.factory.button;

public class UIFFactory {
    public static UIFFactoryFactory uifFactoryFactory(Platforms platforms){
        if (platforms.equals(Platforms.ANDROID)){
            return new AndroidUIFFactory();
        }
        return null;
    }
}
