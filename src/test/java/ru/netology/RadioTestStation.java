package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTestStation {  //прибавляем станции +1

    @Test
    public void shouldNextTransferStation() {
        Radio radio = new Radio();

        radio.nextTransferStation(9);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}
