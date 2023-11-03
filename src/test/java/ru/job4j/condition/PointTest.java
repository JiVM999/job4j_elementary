package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to56then6dot70() {
        double expected = 6.70;
        int x1 = 2;
        int y1 = 0;
        int x2 = 5;
        int y2 = 6;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when25to25then10dot77() {
        double expected = 10.77;
        int x1 = -2;
        int y1 = -5;
        int x2 = 2;
        int y2 = 5;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to102then9dot05() {
        double expected = 9.05;
        int x1 = 1;
        int y1 = 1;
        int x2 = 10;
        int y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1110to10220then13dot49() {
        double expected = 13.49;
        int x1 = 1;
        int y1 = 1;
        int z1 = 10;
        int x2 = 10;
        int y2 = 2;
        int z2 = 20;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}