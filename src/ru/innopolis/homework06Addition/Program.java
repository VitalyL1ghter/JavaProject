package ru.innopolis.homework06Addition;

import java.util.StringJoiner;

public class Program {

    private String nameProgram;
    private int ratingProgram;
    private int viewerProgram;

    public Program(String nameProgram) {
        this.nameProgram = nameProgram;
        this.ratingProgram = getRandomRatingProgram();
        this.viewerProgram = getRandomViewerProgram();
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", "" + "", "")
                .add("nameProgram = '" + nameProgram + "'")
                .add("ratingProgram = " + ratingProgram)
                .add("viewerProgram = " + viewerProgram)
                .toString();
    }
    private int getRandomRatingProgram() {
        return (int) (Math.random() * 100);
    }
    private int getRandomViewerProgram() {
        return (int) (Math.random() * 1000);
    }
}

