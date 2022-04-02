package ru.job4j.calculator;

/**
 * Класс для работы с аргументами методов
 * @author Denis Soldatkin
 * @version 1.0
 */

public class ArgMethod {
    /**
     * Метод приветствия
     * @param name имя
     * @param age возраст
     */
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
