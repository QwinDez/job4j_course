package ru.job4j.converter;

/**
 * Класс для конвертации валюты
 * @author Denis Soldatkin
 * @version 1.0
 */

public class Converter {
    /**
     * Метод для перевода рублей в евро
     * @param value аргумент, рубли
     * @return результат, евро
     */
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    /**
     * Метод для перевода рублей в доллары
     * @param value аргумент, рубли
     * @return результат, доллары
     */
    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Math.round(Converter.rubleToDollar(140));
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");
    }
}
