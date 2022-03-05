package ru.netology.domain;

public class Radio {
    private int currentRadioStation;

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

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation > 9) {
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
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void VolumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 10) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }
}
