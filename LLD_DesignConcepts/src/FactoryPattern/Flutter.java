package FactoryPattern;

public class Flutter {

    void refresh(){
        System.out.println("refreshing UI");
    }


    void setTheme(){
        System.out.println("Setting theme");
    }

    public UIFactory getUIFactory(SupportedPlatforms platforms){


        return UIFactoryFactory.getUIFactoryPlatform(platforms);
    }
}
