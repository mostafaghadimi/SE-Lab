package main.interfaces;

public abstract class Power {
    protected Mult mult;

    public Power(Mult mult) {
    }

    public abstract Integer power(int a, int b);
}
