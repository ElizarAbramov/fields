package ru.netology.domain;

public class Radio {
    private int currentStation;

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


    public void nextStation() {
        if (currentStation == getMaxStation()) {

            this.currentStation = 0;
        }

    }

    public void prevStation() {
        if (currentStation == 0) {

            this.currentStation = getMaxStation();
        }

    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

        public void decreaseStation () {
            int newStation = currentStation - 1;
            setCurrentStation (newStation);
        }


        public int getMaxStation () {
            return 9;
        }
    }



