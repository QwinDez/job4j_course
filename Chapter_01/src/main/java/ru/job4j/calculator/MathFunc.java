package ru.job4j.calculator;

/**
 * Класс работы возвращаемых значений методов
 * @author Denis Soldatkin
 * @version 1.0
 */
public class MathFunc {
    /**
     * Метод для расчета первой функции
     * @param x аргумент функции
     * @return результат функции
     */
    public static int func1(int x) {
        return x * x + 1;
    }

    /**
     * Метод для рассчета второй функции
     * @param x аргумент функции
     * @return результат функции
     */
    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int result3 = MathFunc.func1(100);
        System.out.println(result1 + result2 + result3);
    }
}
