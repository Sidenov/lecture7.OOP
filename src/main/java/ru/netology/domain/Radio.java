package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int amountRadioStation = 10;
    private int currentVolume;

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public Radio() {
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next() {
        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > (amountRadioStation - 1)) {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < 0) {
            currentRadioStation = (amountRadioStation - 1);
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > (amountRadioStation - 1)) {
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
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
