package main.impl.mult;

import main.interfaces.Mult;

public class MultImplStandard implements Mult {
    int a, b;

    public MultImplStandard(int a, int b) {
        this.a = a;
        this.b = b;
    }

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
