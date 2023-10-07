package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i != j) {
            int result = array[i] + array[j];
            if (result == target) {
                return new int[] {i, j};
            }
            if (result > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] {};
    }
}