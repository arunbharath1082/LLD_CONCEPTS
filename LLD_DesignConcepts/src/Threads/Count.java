package Threads;

public class Count {
    private int value = 0;

    public int getValue() {
        return value;
    }
///incValue
    public void incValue(int x) {
        value += x;
    }
}
