package ru.job4j.calculator;

/**
 * Класс арифметических операций над переменными
 * @author Denis Soldatkin
 * @version 1.1
 */

public class Calculator {
    /**
     * Метод для сложения 2 чисел
     * @param first первое число
     * @param second второе число
     */
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }
}
