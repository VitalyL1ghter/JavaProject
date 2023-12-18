package ru.innopolis.homework06Addition;

import java.util.Arrays;
import java.util.StringJoiner;

class Televisor {
    private final String model;
    private final Chanel[] channels;
    private int volume;
    private boolean turnOn;
    private Chanel targetChanel;
    public Televisor(String model, Chanel[] channels, Chanel targetChanel, int volume, boolean turnOn) {
        this.model = model;
        this.channels = channels;
        this.targetChanel = targetChanel;
        this.volume = volume;
        this.turnOn = turnOn;
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", "" + "", "")
                .add("model =  " + model + "'")
                .add("channels = " + Arrays.toString(channels))
                .add("volume = " + volume)
                .add("turnOn = " + turnOn)
                .add("targetChanel = " + targetChanel)
                .toString();
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
    public Chanel getTargetChanel() {
        return targetChanel;
    }
    public void setTargetChanel(Chanel targetChanel) {
        this.targetChanel = targetChanel;
    }
    public String getModel() {
        return model;
    }
    public void changeChanel() {
        targetChanel = channels[(int) (Math.random() * channels.length)];
    }

}



