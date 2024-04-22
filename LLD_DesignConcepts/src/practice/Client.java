package practice;

import practice.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIFFactoryFactory uifFactoryFactory=flutter.getUi(Platforms.ANDROID);
        Button button=uifFactoryFactory.createButton();
        button.click();
    }
}
