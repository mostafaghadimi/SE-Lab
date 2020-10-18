package main.impl.mult;

import main.interfaces.Mult;

public class MultImplStandard implements Mult {
    @Override
    public Integer mult(int a, int b) {
        int result = 0;

        while(b != 0) {
            result += a;
            b -= 1;
        }

        return result;
    }
}
