package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        names[0] = "Vladimir";
        names[1] = "Mikhail";
        names[2] = "Petr";
        names[3] = "Dmitriy";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
