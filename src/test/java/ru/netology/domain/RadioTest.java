package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testGetAmountStationDefaultConstructor() {
        Radio rad1 = new Radio();
        int expected = 10;
        int actual = rad1.getAmountStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetAmountStationNotDefaultConstructor() {
        Radio rad1 = new Radio(20);
        int expected = 20;
        int actual = rad1.getAmountStation();

        assertEquals(expected, actual);
    }


    @Test
    public void testSetStationDefaultConstructor() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationUnderLimitDefaultConstructor() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationOverLimitDefaultConstructor() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationNotDefaultConstructor() {
        Radio rad1 = new Radio(50);
        rad1.setCurrentStation(15);
        int expected = 15;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationOverLimitNotDefaultConstructor() {
        Radio rad1 = new Radio(50);
        rad1.setCurrentStation(50);
        int expected = 0;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationUnderLimitNotDefaultConstructor() {
        Radio rad1 = new Radio(50);
        rad1.setCurrentStation(-1);
        int expected = 0;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testNextStationDefaultConstructor() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(6);
        rad.next();
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationAfterMaxDefaultConstructor() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationNotDefaultConstructor() {// норм
        Radio rad = new Radio(50);
        rad.setCurrentStation(15);
        rad.next();
        int expected = 16;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationAfterMaxNotDefaultConstructor() {// норм
        Radio rad = new Radio(50);
        rad.setCurrentStation(49);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationDefaultConstructor() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(6);
        rad.prev();
        int expected = 5;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void testPrevStationLessMinDefaultConstructor() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationNotDefaultConstructor() {// норм
        Radio rad = new Radio(50);
        rad.setCurrentStation(8);
        rad.prev();
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void testPrevStationLessMinNotDefaultConstructor() {// норм
        Radio rad = new Radio(50);
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 49;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void testSetVolume() {// норм
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeAboveMax() {// норм
        Radio rad = new Radio();
        rad.setCurrentVolume(111);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume() {// норм
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.increaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeAboveLimit() {// норм
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {// норм
        Radio rad = new Radio();
        rad.setCurrentVolume(6);
        rad.decreaseVolume();
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeBelowMin() {// норм
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

}
