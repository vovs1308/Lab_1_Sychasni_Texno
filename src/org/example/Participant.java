package org.example;

import java.time.LocalDateTime;
import java.util.Objects;

public class Participant {
    private String name;
    private int score;
    private LocalDateTime creationDate;

    public Participant(String name) {
        this.name = name;
        this.creationDate = LocalDateTime.now();
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Participant{" + "name='" + name + '\'' + ", score=" + score + ", creationDate=" + creationDate + '}';
    }
}
