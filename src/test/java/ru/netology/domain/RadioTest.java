package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testGetAmountStation() {
        Radio rad1 = new Radio(20);
        int expected = 20;
        int actual = rad1.getAmountStation();

        assertEquals(expected, actual);
    }

    @Test

    public void testForCheckMistake() {// Доп проверка к комментарию проверяющего ДЗ
        Radio rad1 = new Radio(20);
        rad1.setCurrentStation(15);
        int expected = 15;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void testSetStationModify() {
        Radio rad1 = new Radio(50);
        rad1.setCurrentStation(10);
        int expected = 10;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationModifyOverLimit() {
        Radio rad1 = new Radio(50);
        rad1.setCurrentStation(50);
        int expected = 0;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationModifyUnderLimit() {
        Radio rad1 = new Radio(50);
        rad1.setCurrentStation(-1);
        int expected = 0;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStation() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationUnderLimit() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testSetStationOverLimit() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void testNextStation() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(6);
        rad.next();
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationAfterMax() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(6);
        rad.prev();
        int expected = 5;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationLessMin() {// норм
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
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
