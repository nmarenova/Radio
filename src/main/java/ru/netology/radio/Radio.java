package ru.netology.radio;

public class Radio {
    int station = 0;
    int volume = 0;
    int stationQty = 10;

    public Radio() {
    }

    public Radio(int stationQty) {
        this.stationQty = stationQty;
    }

    public void nextStation() {
        station += 1;
        if (station > this.stationQty - 1) {
            station = 0;
        }
    }

    public void prevStation() {
        station -= 1;
        if (station < 0) {
            station = this.stationQty - 1;
        }
    }

    public void setStation(int stationNumber) {
        station = stationNumber;
        if (station > this.stationQty - 1 || station < 0) {
            station = 0;
        }
    }

    public void increaseVolume() {
        volume += 1;
        if (volume > 100) {
            volume = 100;
        }
    }

    public void decreaseVolume() {
        volume -= 1;
        if (volume < 0) {
            volume = 0;
        }
    }
}
