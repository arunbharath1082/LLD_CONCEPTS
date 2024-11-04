package Design_concepts.Decorator;

public class PatternDecorator extends ColorDecorator{
    public PatternDecorator(Color colored) {
        super(colored);
    }
    public void fill(){
        colored.fill();
        addPattern(colored);
    }

    private void addPattern(Color colored){
        System.out.println("Pattern");
    }
}
