package Design_concepts.FactoryPattern.Components.button;

public class AndroidButton implements Button {

    @Override
    public void click() {
        System.out.println("button clicked");
    }
}
