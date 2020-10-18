package main.concrete;

import main.interfaces.Beverage;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Delicious Espresso";
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}
