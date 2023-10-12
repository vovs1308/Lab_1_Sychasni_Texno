package org.example;
abstract class Participant {
    private String name;
    private int score;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public abstract void compete();
}