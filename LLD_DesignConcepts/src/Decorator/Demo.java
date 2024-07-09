package Decorator;

public class Demo {
    public static void main(String[] args) {
        Color black=new Black();
        Color pattern=new PatternDecorator(new Black());

        black.fill();
        pattern.fill();


    }
}
