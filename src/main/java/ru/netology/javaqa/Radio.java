package ru.netology.javaqa;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int minVolumeRadio = 0;
    private int maxVolumeRadio = 99;
    private int currentStation;
    private int volume;



    public Radio(int currentStation) {
        if (currentStation > maxRadioStation) {
            return;
        }
        if (currentStation < minRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public Radio() {
        this.currentStation = currentStation;

    }

    public int getCurrentRadioStation() {
        return currentStation;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMinVolumeRadio() {
        return minVolumeRadio;
    }

    public int getMaxVolumeRadio() {
        return maxVolumeRadio;
    }

    public int getCurrentStation() { return currentStation; }





    public void setCurrentRadioStation(int currentStation) {
        if (currentStation > maxRadioStation) {
            return;
        }
        if (currentStation < minRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void changeOnPreviousStation() {
        if (currentStation == minRadioStation) {
            this.currentStation = maxRadioStation;
            return;
        }
        this.currentStation--;
    }

    public void changeOnNextStation() {
        if (currentStation == maxRadioStation) {
            this.currentStation = minRadioStation;
            return;
        }
        this.currentStation++;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolumeRadio) {
            return;
        }
        if (volume > maxVolumeRadio) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {

        if (volume == maxVolumeRadio) {
            this.volume = volume;
        }
        if (volume < maxVolumeRadio) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == minVolumeRadio) {
            this.volume = volume;
        }
        if (volume > minVolumeRadio) {
            this.volume--;
        }
    }

}