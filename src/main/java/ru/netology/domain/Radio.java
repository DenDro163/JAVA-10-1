package ru.netology.domain;

public class Radio {
    private int currentStation;// Текущая станция
    private int amountStation = 10;// Количество станций
    private int minStation = 0;// Номер первой станции
    private int currentVolume;// Текущая громкость


    public Radio() {// Конструктор без параметров
    }

    public Radio(int amountStation) {// Конструктор с 1 параметром
        this.amountStation = amountStation;
    }// Конструктор с одим параметром

    public int getAmountStation() {
        return amountStation;
    }

    public int getCurrentStation() {// геттер норм
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {// Выставить номер станции с условием  диапазонов  станций
        if (currentStation < minStation) {
            return;// Ранний выход
        }
        if (currentStation > amountStation - 1) {
            return;// Ранний выход
        }
        this.currentStation = currentStation;//
    }


    public void next() {// Следующая станция
        if (currentStation == amountStation - 1) {
            setCurrentStation(currentStation = minStation);
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prev() {// Предыдущ станция
        if (currentStation == minStation) {
            setCurrentStation(amountStation - 1);
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
        if (currentVolume > 100) {
            return;// Ранний выход
        }
        this.currentVolume = currentVolume;//
    }

    public void increaseVolume() {// Увеличить громкость
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {// Уменьшить громкость
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
