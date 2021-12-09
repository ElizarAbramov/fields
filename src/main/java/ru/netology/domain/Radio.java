package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numbersOfStations = 10;

    public Radio() {
    }

    public Radio(int numbersOfStations) {
        this.numbersOfStations = numbersOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > getMaxStation()) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > getMaxVolume()) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {

        if (currentStation < getMaxStation()) {
            this.currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = getMaxStation();
        }
    }

    public int getMaxStation() {
        return numbersOfStations - 1;
    }

    // volumeMethods

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = getMaxVolume();
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentStation = 0;
        }
    }

    public int getMaxVolume() {
        return 100;
    }
}