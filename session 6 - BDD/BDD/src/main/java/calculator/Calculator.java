package calculator;
public class Calculator {
    public int calculate(int a, int b, String operation) {
        if (operation.equals("+")) {
            return a + b;
        }

        else if (operation.equals("-")) {
            return a - b;
        }

        else if (operation.equals("*")){
            return a * b;
        }

        else if (operation.equals("/")){
            return a/b;
        }
        return a;
    }

}