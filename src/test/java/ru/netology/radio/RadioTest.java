package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shoulCreateRadio() {
        Radio radio = new Radio();
    }
    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        assertEquals(0, radio.station);
        assertEquals(0, radio.volume);
    }
    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.station);
    }
    @Test
    public void shouldSwitchToZeroStation() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        assertEquals(0, radio.station);
    }
    @Test
    public void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.station);
        radio.prevStation();
        assertEquals(8, radio.station);
    }
    @Test
    public void shouldSwitchToSetStation() {
        Radio radio = new Radio();
        radio.setStation(15);
        assertEquals(0, radio.station);
        radio.setStation(8);
        assertEquals(8, radio.station);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.volume);
    }
    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 10;
        radio.increaseVolume();
        assertEquals(10, radio.volume);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.volume);
        radio.volume = 5;
        radio.decreaseVolume();
        assertEquals(4, radio.volume);
    }

}