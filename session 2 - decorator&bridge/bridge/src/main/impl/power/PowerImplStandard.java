package main.impl.power;

import main.interfaces.Mult;
import main.interfaces.Power;

public class PowerImplStandard extends Power {

    public PowerImplStandard(Mult mult) {
        super(mult);
    }

    @Override
    public Integer power(int base, int exponent) {
        int result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        return result;
    }
}
