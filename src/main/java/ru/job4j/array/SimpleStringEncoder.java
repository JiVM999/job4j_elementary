package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        result += symbol;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
            } else {
                symbol = input.charAt(i);
                if (counter != 1) {
                    result += counter;
                }
                result += symbol;
                counter = 1;
            }
            if (i == input.length() - 1 && counter != 1) {
                result += counter;
            }
        }
        return result;
    }
}