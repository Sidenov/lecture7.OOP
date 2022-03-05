package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(value = {"'setRadioStation 5', 5, 5",
            "'setRadioStation 9', 9, 9",
            "'setRadioStation 10', 10, 0",
            "'setRadioStation 0', 0, 0",
            "'setRadioStation -1', -1, 0"})
    void setRadioStation(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio();

        station.setCurrentRadioStation(currentRadioStation);

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'nextRadioStation 6', 5, 6",
            "'nextRadioStation 0', 9, 0",
            "'nextRadioStation 1', 0, 1"})
    void next(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio();

        station.setCurrentRadioStation(currentRadioStation);
        station.next();

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'prevRadioStation 4', 5, 4",
            "'prevRadioStation 0', 1, 0",
            "'prevRadioStation 9', 0, 9"})
    void prev(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio();

        station.setCurrentRadioStation(currentRadioStation);
        station.prev();

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


}