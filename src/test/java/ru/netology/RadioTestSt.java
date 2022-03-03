package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTestSt {

    @Test
    void getCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}