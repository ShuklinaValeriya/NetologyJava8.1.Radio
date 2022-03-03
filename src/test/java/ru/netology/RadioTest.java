package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldIncreaseVolume() {  //прибавляем громкость
        Radio radio = new Radio();

        radio.setIncreaseVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}


