package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int i: coins) {
            while ((money - price) / i > 0) {
                rsl[size] = i;
                size++;
                money -= i;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}