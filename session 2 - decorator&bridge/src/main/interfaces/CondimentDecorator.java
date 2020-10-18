package main.interfaces;

import main.interfaces.Beverage;

public abstract class CondimentDecorator  implements Beverage {
    protected Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public Double cost() {
        return beverage.cost();
    }
}
