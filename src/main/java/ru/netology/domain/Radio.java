package ru.netology.domain;

public class Radio {
    private int currentStation;// Текущая станция
    private int currentVolume;// Текущая громкость

    public  Radio() {
        
    }

    public int getCurrentStation() {// геттер норм
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {// Выставить номер станции с условием  диапазонов  станций
        if (currentStation < 0) {
            return;// Ранний выход
        }
        if (currentStation > 9) {
            return;// Ранний выход
        }
        this.currentStation = currentStation;//
    }

    public void next() {// Следующая станция
        if (currentStation == 9) {
            setCurrentStation(currentStation = 0);
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prev() {// Предыдущ станция
        if (currentStation == 0) {
            setCurrentStation(currentStation = 9);
        } else {
            this.currentStation = currentStation - 1;
        }
    }


    public int getCurrentVolume() {// геттер норм
        return currentVolume;
    }// геттер звук

    public void setCurrentVolume(int currentVolume) {// Сеттер на звук
        if (currentVolume < 0) {
            return;// Ранний выход
        }
        if (currentVolume > 10) {
            return;// Ранний выход
        }
        this.currentVolume = currentVolume;//
    }

    public void increaseVolume() {// Увеличить громкость
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {// Уменьшить громкость
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
