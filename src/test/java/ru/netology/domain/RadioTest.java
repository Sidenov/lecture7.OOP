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
    void setRadioStationShouldUseNoArgsConstructor(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio();

        station.setCurrentRadioStation(currentRadioStation);

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'setRadioStation 5', 5, 5",
            "'setRadioStation 9', 9, 9",
            "'setRadioStation 21', 21, 0",
            "'setRadioStation 0', 0, 0",
            "'setRadioStation -1', -1, 0"})
    void setRadioStationShouldUseConstructor(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio(20);

        station.setCurrentRadioStation(currentRadioStation);

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'nextRadioStation 6', 5, 6",
            "'nextRadioStation 0', 9, 0",
            "'nextRadioStation 1', 0, 1"})
    void nextShouldUseNoArgsConstructor(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio();

        station.setCurrentRadioStation(currentRadioStation);
        station.next();

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'nextRadioStation 6', 5, 6",
            "'nextRadioStation 0', 12, 0",
            "'nextRadioStation 1', 0, 1"})
    void nextShouldUseConstructor(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio(13);

        station.setCurrentRadioStation(currentRadioStation);
        station.next();

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'prevRadioStation 4', 5, 4",
            "'prevRadioStation 0', 1, 0",
            "'prevRadioStation 9', 0, 9"})
    void prevShouldUseNoArgsConstructor(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio();

        station.setCurrentRadioStation(currentRadioStation);
        station.prev();

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'prevRadioStation 4', 5, 4",
            "'prevRadioStation 0', 1, 0",
            "'prevRadioStation 14', 0, 14"})
    void prevShouldUseConstructor(String testName, int currentRadioStation, int expected) {
        Radio station = new Radio(15);

        station.setCurrentRadioStation(currentRadioStation);
        station.prev();

        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'setVolumeRadio 5', 5, 5",
            "'setVolumeRadio 10', 10, 10",
            "'setVolumeRadio 101', 101, 0",
            "'setVolumeRadio 0', 0, 0",
            "'setVolumeRadio -1', -1, 0"})
    void setVolume(String testName, int currentRadioStation, int expected) {
        Radio volume = new Radio();

        volume.setCurrentVolume(currentRadioStation);

        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'volumeUp to 6', 5, 6",
            "'volumeUp to 101', 100, 100",
            "'volumeUp to 1', 0, 1"})
    void volumeUp(String testName, int currentRadioStation, int expected) {
        Radio volume = new Radio();

        volume.setCurrentVolume(currentRadioStation);
        volume.volumeUp();

        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'volumeDown to 99', 100, 99",
            "'volumeDown to 0', 1, 0",
            "'volumeDown to -1', 0, 0"})
    void volumeDown(String testName, int currentRadioStation, int expected) {
        Radio volume = new Radio();

        volume.setCurrentVolume(currentRadioStation);
        volume.volumeDown();

        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }
}