package practice.factory.button;

public class AndroidBButton implements Button{
    @Override
    public void click() {
        System.out.println("Android button is clicked");
    }
}
