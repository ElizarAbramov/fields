package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
     public void shouldNextStation(){

        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual );
    }

    @Test
    public void shouldPrevStation(){

        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual );
    }

    @Test
    public void shouldIncreaseStationStation(){

        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual );
    }

    @Test
    public void shouldDecreaseStationStation(){

        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual );
    }
}