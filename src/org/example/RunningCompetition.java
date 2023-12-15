package org.example;

public class RunningCompetition implements Competition {
    private Participant participant;
    private int distance; // Расстояние для соревнования

    public RunningCompetition(Participant participant, int distance) {
        this.participant = participant;
        this.distance = distance;
    }

    @Override
    public void performCompetition() {
        try {
            if (distance < 0) {
                throw new IllegalArgumentException("Расстояние не может быть отрицательным.");
            }

            System.out.println(participant.getName() + " бежит " + distance + " метров.");
            int score = distance / 2;
            participant.setScore(score);
            System.out.println(participant.getName() + " набрал " + score + " очков.");
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполнен.");
        }
    }

    @Override
    public Participant getParticipant() {
        return participant;
    }

    @Override
    public int getScore() {
        // Возвращаем баллы, которые были установлены в performCompetition
        return participant.getScore();
    }
}