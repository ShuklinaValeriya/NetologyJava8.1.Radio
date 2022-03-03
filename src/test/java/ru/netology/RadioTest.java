package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldIncreaseVolumeMin() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOk() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(4);
        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}


