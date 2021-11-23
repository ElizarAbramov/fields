package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldNextStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNegative() {

        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNegative() {

        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

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
    public void shouldIncreaseStationForZero() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForOne() {

        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForTwo() {

        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForThree() {

        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForFour() {

        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForFive() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForSix() {

        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForSeven() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForEight() {

        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationForNine() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForZero() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseStationForOne() {

        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForTwo() {

        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForThree() {

        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForFour() {

        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForFive() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForSix() {

        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForSeven() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForEight() {

        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationForNine() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.decreaseStation();

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