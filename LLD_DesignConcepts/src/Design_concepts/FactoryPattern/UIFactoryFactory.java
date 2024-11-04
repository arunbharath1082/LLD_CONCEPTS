package Design_concepts.FactoryPattern;

public class UIFactoryFactory {
    public  static  UIFactory getUIFactoryPlatform(SupportedPlatforms platforms){
        if(platforms.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        }else if(platforms.equals(SupportedPlatforms.IOS)){
            return new IOSUIFactory();
        }
        else if(platforms.equals(SupportedPlatforms.WINDOWS)) {
            return new WindowsUIFactory();
        }
        return null;
    }
}
