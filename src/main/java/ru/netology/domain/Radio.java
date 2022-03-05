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


}
