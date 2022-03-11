package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int amountRadioStation = 10;

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

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation > (amountRadioStation - 1)) {
            return;
        }
        if (CurrentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void VolumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void VolumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 100) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }
}
