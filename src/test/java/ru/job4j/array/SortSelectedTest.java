package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when524Sort245() {
        int[] data = new int[] {5, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when01943Sort01349() {
        int[] data = new int[] {0, 1, 9, 4, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 3, 4, 9};
        assertThat(result).containsExactly(expected);
    }
}