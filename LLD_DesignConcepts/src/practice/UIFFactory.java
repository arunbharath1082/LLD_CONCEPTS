package practice;

public class UIFFactory {
    public static UIFFactoryFactory uifFactoryFactory(Platforms platforms){
        if (platforms.equals(Platforms.ANDROID)){
            return new AndroidUIFFactory();
        }
        return null;
    }
}
