package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTestSetCurrentStation {  //устанавливаем конкретную станцию

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(16);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}