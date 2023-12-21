package ru.innopolis.homework05;

import java.util.Objects;
import java.util.StringJoiner;

class Televisor {
    private String model;
    private int chanell;
    private int volume;
    private boolean turnOn;

    public Televisor() {
    }

    public Televisor(String model, int chanell, int volume, boolean turnOn) {
        this.model = model;
        this.chanell = chanell;
        this.volume = volume;
        this.turnOn = turnOn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getChanell() {
        return chanell;
    }

    public void setChanell(int chanell) {

        this.chanell = chanell;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;

    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Televisor.class.getSimpleName() + "[", "]")
                .add("model='" + model + "'")
                .add("chanell=" + chanell)
                .add("volume=" + volume)
                .add("turnOn=" + turnOn)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Televisor televisor = (Televisor) o;
        return isTurnOn() == televisor.isTurnOn();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTurnOn());
    }
}



