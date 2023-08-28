package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro140 = Converter.rubleToEuro(140);
        float euro190 = Converter.rubleToEuro(180);
        float dollar140 = Converter.rubleToDollar(140);
        float dollar190 = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro140 + " euro.");
        System.out.println("140 rubles are " + dollar140 + " dollar.");
        System.out.println("190 rubles are " + euro190 + " euro.");
        System.out.println("190 rubles are " + dollar190 + " dollar.");
    }
}