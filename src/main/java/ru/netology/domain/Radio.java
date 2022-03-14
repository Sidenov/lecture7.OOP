package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next() {
        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
