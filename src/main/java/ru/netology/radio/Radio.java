package ru.netology.radio;

public class Radio {
    int station = 0;
    int volume = 0;

    public void nextStation() {
        station += 1;
        if (station > 9) {
            station = 0;
        }
    }

    public void prevStation() {
        station -= 1;
        if (station < 0) {
            station = 9;
        }
    }

    public void setStation(int stationNumber) {
        station = stationNumber;
        if (station > 9) {
            station = 0;
        }
    }

    public void increaseVolume() {
        volume += 1;
        if (volume > 10) {
            volume = 10;
        }
    }

    public void decreaseVolume() {
        volume -= 1;
        if (volume < 0) {
            volume = 0;
        }
    }
}
