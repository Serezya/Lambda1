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
        int mult = calc.multiply.apply(a,b);
        boolean pos = calc.isPositive.test(-5);
        int poow = calc.pow.apply(5);
        calc.println.accept("Результат деления " + c);
        calc.println.accept("Результат умножения " + mult);
        calc.println.accept("Число по модулю " + k);
        calc.println.accept(pos ? "Число положительное" : "Число отрицательное");
        calc.println.accept("Число в квадрате " +poow);
    }
}
