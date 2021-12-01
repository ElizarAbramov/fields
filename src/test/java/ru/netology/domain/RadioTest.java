package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldNegativeSetStationMin() {

        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativeSetStationMax() {

        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForZero() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForOne() {

        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForTwo() {

        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForThree() {

        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForFour() {

        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForFive() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForSix() {

        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForSeven() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForEight() {

        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationForNine() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForZero() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForMinusOne() {

        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForOne() {

        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForTwo() {

        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForThree() {

        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForFour() {

        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForFive() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForSix() {

        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForSeven() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForEight() {

        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationForNine() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    // volumeTests
    @Test
    public void shouldIncreaseVolumeForZero() {

        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativeSetVolumeMin() {

        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativeSetVolumeMax() {

        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForOne() {

        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForTwo() {

        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForThree() {

        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForFour() {

        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForFive() {

        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForSix() {

        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForSeven() {

        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForEight() {

        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForNine() {

        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeForTen() {

        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForZero() {

        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForOne() {

        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForTwo() {

        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForThree() {

        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForFour() {

        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForFive() {

        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForSix() {

        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForSeven() {

        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForEight() {

        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForNine() {

        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeForTen() {

        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseUnderMax() {

        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolumeUnderMax();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseUnderMaxNegative() {

        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolumeUnderMax();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseBelowMin() {

        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolumeBelowMin();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseBelowMinNegative() {

        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolumeBelowMin();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
}