package ru.netology.domain;

public class Radio {
    private int currentStation;// Текущая станция
    private int amountStation;// Количество станций
    private int minStation = 0;// Номер первой станции
    private int maxStation = 10 - 1;
    ;// Номер последней станции
    private int currentVolume;// Текущая громкость


    public Radio() {// Конструктор без параметров
    }

    public Radio(int amountStation) {// Конструктор с 1 параметром
        this.amountStation = amountStation;
    }

    public int getCurrentStation() {// геттер норм
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {// Выставить номер станции с условием  диапазонов  станций
        if (currentStation < minStation) {
            return;// Ранний выход
        }
        if (currentStation > maxStation) {
            return;// Ранний выход
        }
        this.currentStation = currentStation;//
    }


    public void setMaxStation(int amountStation) {// сеттер для последней станции
        this.maxStation = amountStation - 1;
    }

    public int getMaxStation() {// геттер для последней станции
        return maxStation;
    }

    public void next() {// Следующая станция
        if (currentStation == maxStation) {
            setCurrentStation(currentStation = 0);
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prev() {// Предыдущ станция
        if (currentStation == minStation) {
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
