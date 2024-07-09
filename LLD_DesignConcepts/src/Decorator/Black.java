package Decorator;

public class Black implements Color{
    @Override
    public void fill() {
        System.out.println("Black color");
    }
}
