package main.impl.mult;

import main.interfaces.Mult;

public class MultImplRecursive implements Mult {
    @Override
    public Integer mult(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + mult(a, b - 1);
    }
}
