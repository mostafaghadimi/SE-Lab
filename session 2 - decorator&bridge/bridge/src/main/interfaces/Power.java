package main.interfaces;

public abstract class Power {
    protected Mult mult;

    public Power(Mult mult) {
        this.mult = mult;
    }

    public abstract Integer power(int a, int b);
}
