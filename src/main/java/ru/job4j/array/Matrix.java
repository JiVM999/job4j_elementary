package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 1; row <= size; row++) {
            for (int cell = 1; cell <= size; cell++) {
                table[row - 1][cell - 1] = row * cell;
            }
        }
        return table;
    }
}