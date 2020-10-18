package main.concrete;

import main.interfaces.Beverage;

public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "Delicious HouseBlend";
    }

    @Override
    public Double cost() {
        return 0.89;
    }
}
