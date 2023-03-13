package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setStation() {
        Radio cond = new Radio(9);
        Assertions.assertEquals(9, cond.getCurrentStation());
    }

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        int currentStation = -2;
        radio.setCurrentRadioStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void stationChangeIfStationIsMax() {
        Radio radio = new Radio();
        int currentStation = 9;
        radio.setCurrentRadioStation(currentStation);
        radio.changeOnNextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void stationChangeIfStationIsMin() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentRadioStation(currentStation);
        radio.changeOnPreviousStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio();
        int currentStation = 1;
        radio.setCurrentRadioStation(currentStation);
        radio.changeOnPreviousStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void setCurrentStationMin() {
        Radio radio = new Radio();
        int currentStation = 10;
        radio.setCurrentRadioStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();
        int currentStation = 8;
        radio.setCurrentRadioStation(currentStation);
        radio.changeOnNextStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void setVolumeIfVolumeMax() {
        Radio radio = new Radio();
        int volume = 99;
        radio.setVolume(volume);
        int expected = 99;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void setVolumeIfVolumeMin() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void changeVolumeIfVolumeIsAtMax() {
        Radio radio = new Radio();
        int volume = 99;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 99;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void changeVolumeIfVolumeIsAtMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());

    }

    @Test
    void volumeUpForOne() {
        Radio radio = new Radio();
        int volume = 8;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 9;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio();
        int volume = 7;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 6;
        assertEquals(expected, radio.getVolume());

    }

}