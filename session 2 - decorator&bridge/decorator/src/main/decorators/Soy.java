package main.decorators;

import main.interfaces.Beverage;
import main.interfaces.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + " with soy";
    }

    public Double cost() {
        return super.cost() + 0.15;
    }
}
