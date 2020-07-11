package com.company;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2,1);
        // на следующей строке произойдет ошибка, т.к. деление на ноль невозможно
        // можно проверить делимое и делитель. Если =0, то предложить изменить данные.
        int c = calc.devide.apply(a, b);
        int k = calc.abs.apply(-5);
        calc.println.accept(c);
        calc.println.accept(k);
    }
}
