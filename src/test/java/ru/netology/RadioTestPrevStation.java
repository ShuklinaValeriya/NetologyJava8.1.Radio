package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTestPrevStation {  //убавляем станции -1

    @Test
    public void shouldPrevCurrentStation() {
        Radio radio = new Radio();

        radio.prevCurrentStation(-15);
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}