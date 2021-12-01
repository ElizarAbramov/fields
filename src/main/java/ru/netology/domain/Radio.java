package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

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

        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public int getMaxStation() {
        return 9;
    }

    // volumeMethods

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

    public void increaseVolumeUnderMax() {
        if (currentVolume == 10) {

            currentVolume = getMaxVolume();
        }
    }

    public void decreaseVolumeBelowMin() {
        if (currentVolume == 0) {

            currentVolume = 0;
        }
    }

    public int getMaxVolume() {
        return 10;
    }
}