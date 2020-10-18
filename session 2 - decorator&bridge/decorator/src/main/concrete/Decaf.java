package main.concrete;

import main.interfaces.Beverage;

public class Decaf implements Beverage {
    @Override
    public String getDescription() {
        return "Delicious Decaf";
    }

    @Override
    public Double cost() {
        return 1.05;
    }
}
