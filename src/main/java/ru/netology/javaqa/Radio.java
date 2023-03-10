package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public void setCurrentRadioStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void changeOnPreviousStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation--;
    }

    public void changeOnNextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation++;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {

        if (volume == 10) {
            this.volume = volume;
        }
        if (volume < 10) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume > 0) {
            this.volume--;
        }
    }

}